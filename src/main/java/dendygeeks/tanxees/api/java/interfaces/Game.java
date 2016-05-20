package dendygeeks.tanxees.api.java.interfaces;

import java.util.Map;

public interface Game<TPU extends PlayerUnit, 
                      TDD extends DebugData, 
                      TM extends Missile, 
                      TC extends Cell, 
                      TF extends Flag, 
                      TP extends Player<TPU, TDD, TM>> {
	public double getCellSize();
	public int getFieldWidth();
	public int getFieldHeight();
	public boolean isOver();
	
	public Map<String, TP> getPlayers();
	public TF getFlag();
	public TC[] getField();
}
