package mastermind.views.console.menu;

import mastermind.controllers.StartController;

public class NewGameCommand extends Command {

	protected NewGameCommand(StartController startController) {
		super(CommandTitle.NEWGAME_COMMAND.getTitle(), startController);
	}

	@Override
	protected void execute() {
		((StartController) this.acceptorController).start();
	}

	@Override
	public boolean isActive() {
		return true;
	}

}
