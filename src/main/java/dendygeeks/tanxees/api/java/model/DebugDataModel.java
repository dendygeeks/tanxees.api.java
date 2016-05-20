package dendygeeks.tanxees.api.java.model;

import com.google.gson.annotations.Expose;

import dendygeeks.tanxees.api.java.interfaces.DebugData;

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
