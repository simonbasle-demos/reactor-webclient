package reactor.demo.webclient.data;

/**
 * @author Simon Baslé
 */
public class Planet extends Entry {

	private String name;
	private int    rotationPeriod;
	private int    orbitalPeriod;
	private int    diameter;
	private String climate;
	private String gravity;
	private String terrain;

	public Planet() {
	}

	public Planet(String name, int rotationPeriod, int orbitalPeriod, int diameter,
			String climate, String gravity, String terrain, String url) {
		this.name = name;
		this.rotationPeriod = rotationPeriod;
		this.orbitalPeriod = orbitalPeriod;
		this.diameter = diameter;
		this.climate = climate;
		this.gravity = gravity;
		this.terrain = terrain;
		this.url = url;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public String getGravity() {
		return gravity;
	}

	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public void setOrbitalPeriod(int orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}

	public int getRotationPeriod() {
		return rotationPeriod;
	}

	public void setRotationPeriod(int rotationPeriod) {
		this.rotationPeriod = rotationPeriod;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	@Override
	public String toString() {
		return "Planet{" + "name='" + name + '\'' + ", rotationPeriod=" + rotationPeriod + ", orbitalPeriod=" + orbitalPeriod + ", diameter=" + diameter + ", climate='" + climate + '\'' + ", gravity='" + gravity + '\'' + ", terrain='" + terrain + '\'' + ", url='" + url + '\'' + '}';
	}
}
