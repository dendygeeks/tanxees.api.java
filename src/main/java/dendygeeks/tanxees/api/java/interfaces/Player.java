package dendygeeks.tanxees.api.java.interfaces;

import java.util.List;

public interface Player<TPU extends PlayerUnit, TDD extends DebugData, TM extends Missile> {
	
	public UnitType getUnitType();
	public TPU getUnit();
	public Appearance getAppearance();
	public int getFrags();
	public TDD getDebugData();
	public List<TM> getMissiles();

	public boolean ownsMissile(TM m);
}
