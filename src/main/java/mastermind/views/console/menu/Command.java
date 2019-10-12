package mastermind.views.console.menu;

import mastermind.controllers.InGameController;

public abstract class Command extends mastermind.utils.Command {

	protected InGameController inGameController;

	protected Command(String title, InGameController inGameController) {
		super(title);
		this.inGameController = inGameController;
	}

}
