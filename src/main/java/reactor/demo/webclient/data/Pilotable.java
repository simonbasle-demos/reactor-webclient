package reactor.demo.webclient.data;

/**
 * @author Simon Baslé
 */
public abstract class Pilotable extends Entry {

	protected String name;
	protected String model;
	protected String manufacturer;
	protected int    costInCredits;
	protected double length;
	protected int    crew;
	protected int    passengers;
	protected int    cargoCapacity;
	protected String consumables;

	public Pilotable() {
	}

	public Pilotable(String name, String model, String manufacturer, int costInCredits,
			double length, int crew, int passengers, int cargoCapacity,
			String consumables, String url) {
		this.name = name;
		this.model = model;
		this.manufacturer = manufacturer;
		this.costInCredits = costInCredits;
		this.length = length;
		this.crew = crew;
		this.passengers = passengers;
		this.cargoCapacity = cargoCapacity;
		this.consumables = consumables;
		this.url = url;
	}

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public String getConsumables() {
		return consumables;
	}

	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}

	public int getCostInCredits() {
		return costInCredits;
	}

	public void setCostInCredits(int costInCredits) {
		this.costInCredits = costInCredits;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
}
