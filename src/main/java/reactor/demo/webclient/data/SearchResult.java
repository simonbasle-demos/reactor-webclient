package reactor.demo.webclient.data;

import java.util.List;
import java.util.Map;

/**
 * @author Simon Baslé
 */
public class SearchResult {

	private int    count;
	private String next;
	private String previous;

	private List<Map<String, Object>> results;

	public SearchResult() {
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public List<Map<String, Object>> getResults() {
		return results;
	}

	public void setResults(List<Map<String, Object>> results) {
		this.results = results;
	}
}
