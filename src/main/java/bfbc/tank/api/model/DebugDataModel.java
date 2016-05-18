package bfbc.tank.api.model;

import com.google.gson.annotations.Expose;

import bfbc.tank.api.interfaces.DebugData;

public class DebugDataModel implements DebugData {

	@Expose
	private final String svg;
	
	public DebugDataModel(String svg) {
		this.svg = svg;
	}

	public String getSvg() {
		return svg;
	}
}
