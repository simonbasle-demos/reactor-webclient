package reactor.demo.webclient.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Simon Baslé
 */
public class People extends Entry {

	private String name;
	private String birthYear;
	private String gender;
	private String skinColor;
	private String eyeColor;
	private String hairColor;
	@JsonProperty("homeworld")
	private String homeworldReference;
	@JsonIgnore
	private Planet homeworld;

	public People() {
	}

	public People(String name, String birthYear, String gender, String skinColor,
			String eyeColor, String hairColor, Planet homeworld, String url) {
		this.name = name;
		this.birthYear = birthYear;
		this.gender = gender;
		this.skinColor = skinColor;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
		this.homeworld = homeworld;
		this.homeworldReference = homeworld.getUrl();
		this.url = url;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public Planet getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(Planet homeworld) {
		this.homeworld = homeworld;
		this.homeworldReference = homeworld.getUrl();
	}

	public String getHomeworldReference() {
		return homeworldReference;
	}

	public void setHomeworldReference(String homeworldReference) {
		this.homeworldReference = homeworldReference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	@Override
	public String toString() {
		return "People{" + "name='" + name + '\'' + ", birthYear='" + birthYear + '\'' + ", gender='" + gender + '\'' + ", skinColor='" + skinColor + '\'' + ", eyeColor='" + eyeColor + '\'' + ", hairColor='" + hairColor + '\'' + ", homeworldReference='" + homeworldReference + '\'' + ", homeworld=" + homeworld + ", url='" + url + '\'' + '}';
	}
}
