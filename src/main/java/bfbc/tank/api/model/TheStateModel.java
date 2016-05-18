package bfbc.tank.api.model;

import com.google.gson.annotations.Expose;

import bfbc.tank.api.interfaces.GlobalServices;

public class TheStateModel {
	@Expose
	private final GameModel game;
	@Expose
	private final String activePlayerId;

	public TheStateModel(GameModel game, String activePlayerId) {
		this.game = game;
		this.activePlayerId = activePlayerId;
	}
	
	public synchronized String toJson() {
		return GlobalServices.getGson().toJson(this);
	}
}