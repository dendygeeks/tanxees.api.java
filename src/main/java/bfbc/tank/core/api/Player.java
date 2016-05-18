package bfbc.tank.core.api;

import java.util.List;

public interface Player {
	
	public UnitType getUnitType();
	public PlayerUnit getUnit();
	public Appearance getAppearance();
	public int getFrags();
	public DebugData getDebugData();
	public List<Missile> getMissiles();

	public boolean ownsMissile(Missile m);
}
