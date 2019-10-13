package mastermind.views.console.menu;

import mastermind.controllers.StartController;
import mastermind.utils.Console;

public class GameSelectCommand extends Command {

	protected GameSelectCommand(String title, StartController startController) {
		super(title, startController);
	}

	@Override
	protected void execute() {
		new Console().writeln(this.title);
		((StartController) this.acceptorController).start(this.title);

	}

	@Override
	public boolean isActive() {
		return true;
	}

}
