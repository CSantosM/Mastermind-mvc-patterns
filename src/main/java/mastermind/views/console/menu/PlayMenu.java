package mastermind.views.console.menu;

import mastermind.controllers.InGameController;
import mastermind.utils.Menu;

public class PlayMenu extends Menu {

	public PlayMenu(InGameController inGameController) {
		this.addCommand(new ProposeCommand(inGameController));
		this.addCommand(new RedoCommand(inGameController));
		this.addCommand(new UndoCommand(inGameController));
	}

}
