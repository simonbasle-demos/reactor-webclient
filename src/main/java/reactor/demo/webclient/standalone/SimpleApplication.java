package reactor.demo.webclient.standalone;

import reactor.core.publisher.Mono;
import reactor.demo.webclient.data.Entry;
import reactor.demo.webclient.data.People;
import reactor.demo.webclient.data.Planet;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author Simon Baslé
 */
public class SimpleApplication {

	private static WebClient webClient;

	//this is not a Boot application ;)
	public static void main(String[] args) throws InterruptedException {
		webClient = WebClient.builder()
		                     .baseUrl("https://swapi.co/api/")
		                     .defaultHeader("ACCEPT", MediaType.APPLICATION_JSON_VALUE)
		                     .build();

		requestPeople(13, 25);
		chewbacca();

		Thread.sleep(10000);
	}

	private static void requestPeople(int id1, int id2) {
		Mono<People> people1Mono = webClient
				.get()
				.uri("/people/{id}/", id1)
				.retrieve()
				.bodyToMono(People.class);

		Mono<People> people2Mono = webClient
				.get()
				.uri("/people/{id}/", id2)
				.retrieve()
				.bodyToMono(People.class);

		people1Mono.map(Entry::toString)
		       .subscribe(System.out::println);

		System.out.println("Hello");

		People people2 = people2Mono.block();
		System.out.println(people2);
	}

	private static void chewbacca() {
		Mono<People> chewbaccaJson = webClient
				.get()
				.uri("/people/{id}/", 13)
				.retrieve()
				.bodyToMono(People.class);

		People fullbacca = chewbaccaJson.flatMap(partial ->
				webClient.get()
				         .uri(partial.getHomeworldReference())
				         .retrieve()
				         .bodyToMono(Planet.class)
				         .doOnNext(partial::setHomeworld)
				         .thenReturn(partial))
		             .block();

		System.out.println(fullbacca);
	}

}
