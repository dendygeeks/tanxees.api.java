package bfbc.tank.api.model;

import com.google.gson.annotations.Expose;

import bfbc.tank.api.interfaces.Cell;
import bfbc.tank.api.interfaces.CellType;

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
