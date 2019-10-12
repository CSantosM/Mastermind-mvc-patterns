package mastermind.views.console.menu;

import mastermind.controllers.InGameController;

public class RedoCommand extends Command {

	public RedoCommand(InGameController inGameController) {
		super(CommandTitle.REDO_COMMAND.getTitle(), inGameController);
	}

	@Override
	protected void execute() {
		this.inGameController.redo();
	}

	@Override
	public boolean isActive() {
		return this.inGameController.isredoable();
	}
}
