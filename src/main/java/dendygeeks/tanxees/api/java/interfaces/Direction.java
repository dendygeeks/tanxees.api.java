package dendygeeks.tanxees.api.java.interfaces;

public enum Direction {
	RIGHT(0), DOWN(90), LEFT(180), UP(270);
	
	public final int angle;
	
	Direction(int angle) {
		this.angle = angle;
	}
	
}
