package dendygeeks.tanxees.api.java.interfaces;

public enum CellType {
	EMPTY("E"), 
	CONCRETE("C"), 
	BRICKS("B"), 
	DARK_CONCRETE("DC"),
	DARK_BRICKS("DB");
	
	public final String code;
	
	CellType(String code) {
		this.code = code;
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
