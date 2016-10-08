package dendygeeks.tanxees.api.java.model;

import com.google.gson.annotations.Expose;

import dendygeeks.tanxees.api.java.interfaces.PlayerUnit;

public class PlayerUnitModel extends UnitModel implements PlayerUnit {
	
	@Expose
	private double spawnMoment;

	@Expose
	private boolean moving;
	
	public PlayerUnitModel(double sizeX, double sizeY, double posX, double posY, double angle, double spawnMoment, boolean moving) {
		super(sizeX, sizeY, posX, posY, angle);
		this.moving = moving;
		this.spawnMoment = spawnMoment;
	}

	@Override
	public boolean isMoving() {
		return moving;
	}
	
	public void setMoving(boolean moving) {
		this.moving = moving;
	}
	
	@Override
	public double getSpawnMoment() {
		return spawnMoment;
	}
	
	public void setSpawnMoment(double spawnMoment) {
		this.spawnMoment = spawnMoment;
	}
}