package dendygeeks.tanxees.api.java.model;

import com.google.gson.annotations.Expose;

import dendygeeks.tanxees.api.java.interfaces.Cell;
import dendygeeks.tanxees.api.java.interfaces.CellType;

public class CellModel implements Cell {
	
	@Expose
	private CellType type;
	
	public CellModel(CellType type) {
		this.type = type;
	}
	
	public void setType(CellType type) {
		this.type = type;
	}
	
	@Override
	public CellType getType() {
		return type;
	}

}
