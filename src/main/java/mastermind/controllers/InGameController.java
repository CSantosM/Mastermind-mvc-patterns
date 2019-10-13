package mastermind.controllers;

import java.util.List;

import mastermind.models.Session;
import mastermind.types.Color;
import mastermind.types.Error;

public abstract class InGameController extends AcceptorController {


	protected InGameController(Session session) {
		super(session);
	}

	public abstract void redo();

	public abstract boolean isredoable();

	public abstract void undo();

	public abstract boolean isUndoable();

	public abstract Error addProposedCombination(List<Color> colors);

	public abstract List<Color> getColors(int position);

	public abstract int getAttempts();

	public abstract int getBlacks(int position);

	public abstract int getWhites(int position);

	public abstract boolean isWinner();

	public abstract boolean isLooser();

	public abstract void proposalViewInteract();

	@Override
	public void accept(ControllersVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}
}
