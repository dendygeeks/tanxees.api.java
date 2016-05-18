package bfbc.tank.api.model;

import com.google.gson.annotations.Expose;

import bfbc.tank.api.interfaces.Unit;

/**
 * Something that can move and rotate
 */
public class UnitModel implements Unit {
	
	@Expose
	protected double sizeX, sizeY;
	@Expose
	protected double posX;
	@Expose
	protected double posY;
	@Expose
	protected double angle;
	
	public UnitModel(double sizeX, double sizeY, double posX, double posY, double angle) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.posX = posX;
		this.posY = posY;
		this.angle = angle;
	}

	public double getPosX() {
		return posX;
	}
	public double getPosY() {
		return posY;
	}
	public double getAngle() {
		return angle;
	}

	@Override
	public double getSizeX() {
		return sizeX;
	}

	@Override
	public double getSizeY() {
		return sizeY;
	}

	public void setSizeX(double sizeX) {
		this.sizeX = sizeX;
	}

	public void setSizeY(double sizeY) {
		this.sizeY = sizeY;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	
}
