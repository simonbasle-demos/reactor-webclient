package reactor.demo.webclient.boot;

import java.time.Duration;
import java.util.Map;
import java.util.NoSuchElementException;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.demo.webclient.data.SearchResult;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author Simon Baslé
 */
@RestController
@RequestMapping("/api")
public class MyController {

	private final WebClient webClient;
	private long timeoutMillis;
	private Duration timeout;
	private ResponseEntity<Object> timeoutError;

	public MyController(WebClient.Builder clientBuilder) {
		webClient = clientBuilder.baseUrl("https://swapi.co/api/").build();
		confTimeout(700L);
	}

	@PutMapping("/search")
	public ResponseEntity confTimeout(@RequestBody long newTimeout) {
		this.timeoutMillis = newTimeout;
		this.timeout = Duration.ofMillis(timeoutMillis);
		this.timeoutError = ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT)
				              .body("Didn't get a response within " + timeoutMillis + "ms");
		return ResponseEntity.ok().build();
	}

	@GetMapping("/search/{keyword}")
	public Mono<ResponseEntity<Object>> search(@PathVariable String keyword) {
		return patienceSearch(keyword)
				.timeout(timeout, Mono.just(timeoutError));
	}

	@GetMapping("/searchPatience/{keyword}")
	public Mono<ResponseEntity<Object>> patienceSearch(@PathVariable String keyword) {
		return byResource("films", keyword, true)
				.onErrorResume(e -> byResource("people", keyword, true))
				.onErrorResume(e -> byResource("vehicles", keyword, true))
				.onErrorResume(e -> byResource("starships", keyword, true))
				.onErrorResume(e -> byResource("planets", keyword, true))
				.onErrorResume(e -> byResource("species", keyword, true))
				.collectList()
				.map(ResponseEntity::<Object>ok)
				.doOnError(System.out::println)
				.onErrorReturn(ResponseEntity.<Object>notFound().build());
	}

	@GetMapping("/searchFast/{keyword}")
	public Mono<ResponseEntity<Object>> searchFast(@PathVariable String keyword) {
		return Flux.just("films", "people", "vehicles", "starships", "planets", "species")
				.flatMap(resource -> byResource(resource, keyword, false))
				.collectList()
				.map(ResponseEntity::<Object>ok)
				.onErrorReturn(ResponseEntity.<Object>notFound().build())
				.timeout(timeout, Mono.just(timeoutError));
	}

	private Flux<Map<String, Object>> byResource(String resource, String keyword, boolean failOnNotFound) {
		return webClient
				.get()
				.uri("/{resource}/?search={keyword}", resource, keyword)
				.retrieve()
				.bodyToMono(SearchResult.class)
				.flatMapMany(result -> {
					if (result.getCount() == 0) {
						return failOnNotFound
								? Mono.error(new NoSuchElementException("No data in " + resource + " for " + keyword))
								: Mono.empty();
					}
					return Flux.fromIterable(result.getResults());
				});
	}
}
