package reactor.demo.webclient.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Simon Baslé
 */
public class Species extends Entry {

	private String name;
	private String classification;
	private String designation;
	private int    averageHeight;
	private String skinColors;
	private String hairColors;
	private String eyeColors;
	private int    averageLifespan;
	private String language;
	@JsonProperty("homeworld")
	private String homeworldRef;

	public Species() {
	}

	public Species(String name, String classification, String designation,
			int averageHeight, String skinColors, String hairColors, String eyeColors,
			int averageLifespan, String language, String url, String homeworldRef) {
		this.name = name;
		this.classification = classification;
		this.designation = designation;
		this.averageHeight = averageHeight;
		this.skinColors = skinColors;
		this.hairColors = hairColors;
		this.eyeColors = eyeColors;
		this.averageLifespan = averageLifespan;
		this.language = language;
		this.url = url;
		this.homeworldRef = homeworldRef;
	}

	public int getAverageHeight() {
		return averageHeight;
	}

	public void setAverageHeight(int averageHeight) {
		this.averageHeight = averageHeight;
	}

	public int getAverageLifespan() {
		return averageLifespan;
	}

	public void setAverageLifespan(int averageLifespan) {
		this.averageLifespan = averageLifespan;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEyeColors() {
		return eyeColors;
	}

	public void setEyeColors(String eyeColors) {
		this.eyeColors = eyeColors;
	}

	public String getHairColors() {
		return hairColors;
	}

	public void setHairColors(String hairColors) {
		this.hairColors = hairColors;
	}

	public String getHomeworldRef() {
		return homeworldRef;
	}

	public void setHomeworldRef(String homeworldRef) {
		this.homeworldRef = homeworldRef;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkinColors() {
		return skinColors;
	}

	public void setSkinColors(String skinColors) {
		this.skinColors = skinColors;
	}

	@Override
	public String toString() {
		return "Species{" + "name='" + name + '\'' + ", classification='" + classification + '\'' + ", designation='" + designation + '\'' + ", averageHeight=" + averageHeight + ", skinColors='" + skinColors + '\'' + ", hairColors='" + hairColors + '\'' + ", eyeColors='" + eyeColors + '\'' + ", averageLifespan=" + averageLifespan + ", language='" + language + '\'' + ", homeworldRef='" + homeworldRef + '\'' + ", url='" + url + '\'' + '}';
	}
}
