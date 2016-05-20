package dendygeeks.tanxees.api.java.model;

import com.google.gson.annotations.Expose;

import dendygeeks.tanxees.utils.GlobalServices;

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
	
	public static TheStateModel fromJson(String json) {
		return GlobalServices.getGson().fromJson(json, TheStateModel.class);
	}
	
	public GameModel getGameModel() {
		return game;
	}
}