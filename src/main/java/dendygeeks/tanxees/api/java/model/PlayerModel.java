package dendygeeks.tanxees.api.java.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

import dendygeeks.tanxees.api.java.interfaces.Appearance;
import dendygeeks.tanxees.api.java.interfaces.Player;
import dendygeeks.tanxees.api.java.interfaces.UnitType;

public class PlayerModel implements Player<PlayerUnitModel, DebugDataModel, MissileModel> {
		
	@Expose
	private PlayerUnitModel unit;

	@Expose
	private UnitType unitType;
	
	@Expose
	private Appearance appearance;

	@Expose
	private int frags;

	@Expose
	private DebugDataModel debugData;

	@Expose
	private List<MissileModel> missiles = new ArrayList<>();

	public PlayerModel(UnitType unitType, Appearance appearance, int frags) {
		this.unitType = unitType;
		this.appearance = appearance;
		this.frags = frags;
	}
	
	@Override
	public UnitType getUnitType() {
		return unitType;
	}

	@Override
	public PlayerUnitModel getUnit() {
		return unit;
	}

	@Override
	public Appearance getAppearance() {
		return appearance;
	}
	
	@Override
	public int getFrags() {
		return frags;
	}

	@Override
	public DebugDataModel getDebugData() {
		return debugData;
	}

	@Override
	public List<MissileModel> getMissiles() {
		return missiles;
	}

	@Override
	public boolean ownsMissile(MissileModel m) {
		return missiles.contains(m);
	}
	
	public void setFrags(int frags) {
		this.frags = frags;
	}

	public void setPlayerUnitModel(PlayerUnitModel playerUnitModel) {
		this.unit = playerUnitModel;
	}
	
	public void setDebugData(DebugDataModel debugData) {
		this.debugData = debugData;
	}
	
}
