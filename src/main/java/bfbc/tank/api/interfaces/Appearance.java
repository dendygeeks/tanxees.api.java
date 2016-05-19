package bfbc.tank.api.interfaces;
public enum Appearance {

	GREEN("green"), YELLOW("yellow"), GRAY("gray");

	public final String id;

	Appearance(String id) {
		this.id = id;
	}
	
	public static Appearance fromId(String id) {
		for (Appearance val : values()) {
			if (val.id == id) return val;
		}
		return null;
	}
}
