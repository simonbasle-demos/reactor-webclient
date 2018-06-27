package reactor.demo.webclient.data;

/**
 * @author Simon Baslé
 */
public class Vehicule extends Pilotable {

	private String vehicleClass;

	public Vehicule() {
	}

	public Vehicule(String name, String model, String manufacturer, int costInCredits,
			double length, int crew, int passengers, int cargoCapacity,
			String consumables, String url, String vehicleClass) {
		super(name,
				model,
				manufacturer,
				costInCredits,
				length,
				crew,
				passengers,
				cargoCapacity,
				consumables,
				url);
		this.vehicleClass = vehicleClass;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	@Override
	public String toString() {
		return "Vehicule{" + "vehicleClass='" + vehicleClass + '\'' + ", name='" + name + '\'' + ", model='" + model + '\'' + ", manufacturer='" + manufacturer + '\'' + ", costInCredits=" + costInCredits + ", length=" + length + ", crew=" + crew + ", passengers=" + passengers + ", cargoCapacity=" + cargoCapacity + ", consumables='" + consumables + '\'' + ", url='" + url + '\'' + '}';
	}
}
