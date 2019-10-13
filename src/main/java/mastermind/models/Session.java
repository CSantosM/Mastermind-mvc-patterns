package mastermind.models;

import java.util.List;

import mastermind.types.Color;

public interface Session {

	public int getGameWidth();

	public void nextState();

	public void gameClear();

	public void stateReset();

	public boolean isGameLooser();

	public boolean isGameWinner();

	public void addProposedCombination(List<Color> colors);

	public int getAttempts();

	public List<Color> getColors(int position);

	public int getBlacks(int position);

	public int getWhites(int position);

	public StateValue getValueState();

	public void redo();

	public boolean isRedoable();

	public void undo();

	public boolean isUndoable();

}
