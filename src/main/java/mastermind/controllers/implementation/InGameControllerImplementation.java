package mastermind.controllers.implementation;

import java.util.List;

import mastermind.controllers.InGameController;
import mastermind.controllers.ProposalController;
import mastermind.controllers.RedoController;
import mastermind.controllers.UndoController;
import mastermind.models.Session;
import mastermind.types.Color;
import mastermind.types.Error;
import mastermind.views.console.ProposalView;

public class InGameControllerImplementation extends InGameController {

	private ProposalController proposalController;

	private UndoController undoController;

	private RedoController redoController;

	InGameControllerImplementation(Session session) {
		super(session);
		this.proposalController = new ProposalController(this.session);
		this.undoController = new UndoController(this.session);
		this.redoController = new RedoController(this.session);
	}

	public void redo() {
		this.redoController.redo();
	}

	public boolean isredoable() {
		return this.redoController.isRedoable();
	}

	public void undo() {
		this.undoController.undo();
	}

	public boolean isUndoable() {
		return this.undoController.isUndoable();
	}

	public Error addProposedCombination(List<Color> colors) {
		return this.proposalController.addProposedCombination(colors);
	}

	public List<Color> getColors(int position) {
		return this.proposalController.getColors(position);
	}

	public int getAttempts() {
		return this.proposalController.getAttempts();
	}

	public int getBlacks(int position) {
		return this.proposalController.getBlacks(position);
	}

	public int getWhites(int position) {
		return this.proposalController.getWhites(position);
	}

	public boolean isWinner() {
		return this.proposalController.isWinner();
	}

	public boolean isLooser() {
		return this.proposalController.isLooser();
	}

	public void proposalViewInteract() {
		new ProposalView().interact(this.proposalController);

	}

}
