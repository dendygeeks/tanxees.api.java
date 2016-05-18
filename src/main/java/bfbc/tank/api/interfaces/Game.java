package bfbc.tank.api.interfaces;

import java.util.Map;

public interface Game {
	public double getCellSize();
	public int getFieldWidth();
	public int getFieldHeight();
	public boolean isOver();
	
	public Map<String, Player> getPlayers();
	public Flag getFlag();
	public Cell[] getField();
}
