package dendygeeks.tanxees.api.java.interfaces;
public enum UnitType {

	SMALL("small", 20/*22*/, 27, 1.0, 1.0, 1.0, 0.7), MEDIUM("medium", 34, 34, 5.0, 1.0, 300.0, 200.0);

	public final String id;
	public final double sizeW, sizeL;
	public final double mass, midship, forwardPower, backwardPower;

	public static UnitType fromId(String id) {
		for (UnitType val : values()) {
			if (val.id.equals(id)) return val;
		}
		return null;
	}
	
	UnitType(String id, double sizeW, double sizeL, double mass, double midship, double forwardPower, double backwardPower) {
		this.id = id;
		this.sizeW = sizeW;
		this.sizeL = sizeL;
		this.mass = mass;
		this.midship = midship;
		this.forwardPower = forwardPower;
		this.backwardPower = backwardPower;
	}
}
