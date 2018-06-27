package reactor.demo.webclient.data;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * @author Simon Baslé
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public abstract class Entry {

	protected String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
