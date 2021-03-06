package dendygeeks.tanxees.api.java.interfaces;
public enum Appearance {

	GREEN("green"), YELLOW("yellow"), GRAY("gray");

	public final String id;

	Appearance(String id) {
		this.id = id;
	}
	
	public static Appearance fromId(String id) {
		for (Appearance val : values()) {
			if (val.id.equals(id)) return val;
		}
		return null;
	}
}
