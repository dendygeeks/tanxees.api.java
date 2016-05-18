package bfbc.tank.api.model;

import bfbc.tank.api.interfaces.Missile;

public class MissileModel extends UnitModel implements Missile {
	
	public MissileModel(double sizeX, double sizeY, double posX, double posY, double angle, boolean isCrashed) {
		super(sizeX, sizeY, posX, posY, angle);
	}

}
