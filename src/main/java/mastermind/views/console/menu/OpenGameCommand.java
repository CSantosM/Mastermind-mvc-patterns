package mastermind.views.console.menu;

import mastermind.controllers.StartController;

public class OpenGameCommand extends Command {

	protected OpenGameCommand(StartController startController) {
		super(CommandTitle.OPENGAME_COMMAND.getTitle(), startController);
	}

	@Override
	protected void execute() {
		new GameSelectMenu((StartController) this.acceptorController).execute();

	}

	@Override
	public boolean isActive() {
		return true;
	}

}
