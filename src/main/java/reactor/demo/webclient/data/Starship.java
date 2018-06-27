package reactor.demo.webclient.data;

/**
 * @author Simon Baslé
 */
public class Starship extends Pilotable {

	private double hyperdriveRating;
	private int    MGLT;
	private String starshipClass;

	public Starship() {
	}

	public Starship(String name, String model, String manufacturer, int costInCredits,
			double length, int crew, int passengers, int cargoCapacity,
			String consumables, String url, double hyperdriveRating, int MGLT,
			String starshipClass) {
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
		this.hyperdriveRating = hyperdriveRating;
		this.MGLT = MGLT;
		this.starshipClass = starshipClass;
	}

	public double getHyperdriveRating() {
		return hyperdriveRating;
	}

	public void setHyperdriveRating(double hyperdriveRating) {
		this.hyperdriveRating = hyperdriveRating;
	}

	public int getMGLT() {
		return MGLT;
	}

	public void setMGLT(int MGLT) {
		this.MGLT = MGLT;
	}

	public String getStarshipClass() {
		return starshipClass;
	}

	public void setStarshipClass(String starshipClass) {
		this.starshipClass = starshipClass;
	}

	@Override
	public String toString() {
		return "Starship{" + "hyperdriveRating=" + hyperdriveRating + ", MGLT=" + MGLT + ", starshipClass='" + starshipClass + '\'' + ", name='" + name + '\'' + ", model='" + model + '\'' + ", manufacturer='" + manufacturer + '\'' + ", costInCredits=" + costInCredits + ", length=" + length + ", crew=" + crew + ", passengers=" + passengers + ", cargoCapacity=" + cargoCapacity + ", consumables='" + consumables + '\'' + ", url='" + url + '\'' + '}';
	}
}
