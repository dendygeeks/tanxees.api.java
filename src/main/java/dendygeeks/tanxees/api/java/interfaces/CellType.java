package dendygeeks.tanxees.api.java.interfaces;

public enum CellType {
	EMPTY("E", 12.0, 30.0),
	CONCRETE("C", 0.0, 0.0),
	BRICKS("B", 0.0, 0.0),
	TREE("T", 2.0, 1.0),
	DARK_CONCRETE("DC", 0.0, 0.0),
	DARK_BRICKS("DB", 0.0, 0.0),
	WATER("W", 0.0, 0.0),
	ICE("I", 1.0, 0.3);
	
	public final String code;
	public final double dryFriction, airFriction;
	
	CellType(String code, double dryFriction, double airFriction) {
		this.code = code;
		this.dryFriction = dryFriction;
		this.airFriction = airFriction;
	}
	
	public static CellType fromCode(String code) {
		for (CellType val : values()) {
			if (val.code.equals(code)) return val;
		}
		return null;
	}
	
	/**
	 * @return <code>true</code> if this cell type is impassable unless destroyed 
	 */
	public boolean isWall() {
		return this.equals(CONCRETE) ||
		       this.equals(BRICKS) ||
		       this.equals(DARK_CONCRETE) ||
		       this.equals(DARK_BRICKS);
	}
	
	public boolean isBrick() {
		return this.equals(BRICKS) || 
		       this.equals(DARK_BRICKS);
	}
}
