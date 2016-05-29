package dendygeeks.tanxees.api.java.model;

import com.google.gson.annotations.Expose;

import dendygeeks.tanxees.api.java.interfaces.Cell;
import dendygeeks.tanxees.api.java.interfaces.CellType;

public class CellModel implements Cell {
	
	@Expose
	private CellType type;
	
	@Expose
	private Long touched;
	
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

	public void setMovementTouchMoment(long touched) {
		this.touched = touched;
	}
	
	public long getMovementTouchMoment() {
		return touched;
	}
}
