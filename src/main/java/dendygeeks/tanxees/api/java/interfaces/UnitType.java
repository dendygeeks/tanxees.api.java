package dendygeeks.tanxees.api.java.interfaces;
public enum UnitType {

	SMALL("small", 20/*22*/, 27), MEDIUM("medium", 34, 34);

	public final String id;
	public final double sizeW, sizeL;

	public static UnitType fromId(String id) {
		for (UnitType val : values()) {
			if (val.id == id) return val;
		}
		return null;
	}
	
	UnitType(String id, double sizeW, double sizeL) {
		this.id = id;
		this.sizeW = sizeW;
		this.sizeL = sizeL;
	}
}
