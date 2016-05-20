package dendygeeks.tanxees.api.java.model;

import com.google.gson.annotations.Expose;

import dendygeeks.tanxees.api.java.interfaces.PlayerUnit;

public class PlayerUnitModel extends UnitModel implements PlayerUnit {
	
	@Expose
	private boolean moving;
	
	public PlayerUnitModel(double sizeX, double sizeY, double posX, double posY, double angle, boolean moving) {
		super(sizeX, sizeY, posX, posY, angle);
		this.moving = moving;
	}

	@Override
	public boolean isMoving() {
		return moving;
	}
	
	public void setMoving(boolean moving) {
		this.moving = moving;
	}
}