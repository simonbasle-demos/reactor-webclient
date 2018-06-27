package reactor.demo.webclient.data;

import java.util.Date;

/**
 * @author Simon Baslé
 */
public class Movie extends Entry {

	private String title;
	private int    episodeId;
	private String openingCrawl;
	private String director;
	private String producer;
	private Date   releaseDate;

	public Movie() {
	}

	public Movie(String title, int episodeId, String openingCrawl, String director,
			String producer, Date releaseDate, String url) {
		this.title = title;
		this.episodeId = episodeId;
		this.openingCrawl = openingCrawl;
		this.director = director;
		this.producer = producer;
		this.releaseDate = releaseDate;
		this.url = url;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(int episodeId) {
		this.episodeId = episodeId;
	}

	public String getOpeningCrawl() {
		return openingCrawl;
	}

	public void setOpeningCrawl(String openingCrawl) {
		this.openingCrawl = openingCrawl;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Movie{" + "title='" + title + '\'' + ", episodeId=" + episodeId + ", openingCrawl='" + openingCrawl + '\'' + ", director='" + director + '\'' + ", producer='" + producer + '\'' + ", releaseDate=" + releaseDate + ", url='" + url + '\'' + '}';
	}
}
