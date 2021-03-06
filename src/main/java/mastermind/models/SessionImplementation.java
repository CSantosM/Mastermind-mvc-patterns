package mastermind.models;

import java.util.List;

import mastermind.types.Color;

public class SessionImplementation implements Session {

	private State state;

	private Game game;

	private Registry registry;

	private String name;

	public SessionImplementation() {
		this.state = new State();
		this.game = new Game();
		this.registry = new Registry(this.game);
	}

	public int getGameWidth() {
		return this.game.getWidth();
	}

	public void nextState() {
		this.state.next();
	}

	public void gameClear() {
		this.game.clear();

	}

	public void stateReset() {
		this.state.reset();

	}

	public boolean isGameLooser() {
		return this.game != null && this.game.isLooser();
	}

	public boolean isGameWinner() {
		return this.game != null && this.game.isWinner();
	}

	public void addProposedCombination(List<Color> colors) {
		this.game.addProposedCombination(colors);
		this.registry.registry();
	}

	public int getAttempts() {
		return this.game.getAttempts();
	}

	public List<Color> getColors(int position) {
		return this.game.getColors(position);
	}

	public int getBlacks(int position) {
		return this.game.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.game.getWhites(position);
	}

	public StateValue getValueState() {
		return this.state.getValueState();
	}

	public void redo() {
		this.registry.redo(this.game);
	}

	public boolean isRedoable() {
		return this.registry.isRedoable();
	}

	public void undo() {
		this.registry.undo(this.game);
	}

	public boolean isUndoable() {
		return this.registry.isUndoable();
	}

	public boolean hasName() {
		return this.name != null;
	}

	public boolean isGameFinished() {
		return this.game.isFinished();
	}

	public void resetRegistry() {
		this.registry.reset();

	}

	public void setStateValue(StateValue state) {
		this.state.setStateValue(state);

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public Game getGame() {
		return this.game;
	}

}
