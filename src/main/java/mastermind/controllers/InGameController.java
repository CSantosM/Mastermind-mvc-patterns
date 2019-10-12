package mastermind.controllers;

import java.util.List;

import mastermind.models.Session;
import mastermind.types.Color;
import mastermind.types.Error;
import mastermind.views.console.ProposalView;

public class InGameController extends AcceptorController {

	private ProposalController proposalController;

	private UndoController undoController;

	private RedoController redoController;

	InGameController(Session session) {
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

	@Override
	public void accept(ControllersVisitor controllerVisitor) {
		controllerVisitor.visit(this);
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
