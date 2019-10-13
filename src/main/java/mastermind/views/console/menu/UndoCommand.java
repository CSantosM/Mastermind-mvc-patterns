package mastermind.views.console.menu;

import mastermind.controllers.InGameController;

public class UndoCommand extends Command {
	
	public UndoCommand(InGameController inGameController) {
		super(CommandTitle.UNDO_COMMAND.getTitle(), inGameController);
	}

	@Override
	protected void execute() {
		((InGameController) this.acceptorController).undo();
	}

	@Override
	public boolean isActive() {
		return ((InGameController) this.acceptorController).isUndoable();
	}

}
