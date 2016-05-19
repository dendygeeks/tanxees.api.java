package bfbc.tank.api.model;

import com.google.gson.annotations.Expose;

import bfbc.tank.utils.GlobalServices;

public class PlayerKeysModel {
	@Expose
	private boolean right;
	@Expose
	private boolean up;
	@Expose
	private boolean left;
	@Expose
	private boolean down;
	@Expose
	private boolean fire;

	public PlayerKeysModel() {
	}
	
	public PlayerKeysModel(boolean right, boolean up, boolean left, boolean down, boolean fire) {
		super();
		this.right = right;
		this.up = up;
		this.left = left;
		this.down = down;
		this.fire = fire;
	}
	public boolean isRight() {
		return right;
	}
	public boolean isUp() {
		return up;
	}
	public boolean isLeft() {
		return left;
	}
	public boolean isDown() {
		return down;
	}
	public boolean isFire() {
		return fire;
	}


}
