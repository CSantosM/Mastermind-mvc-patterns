package mastermind.views.console;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.InGameController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.views.View;
import mastermind.views.console.menu.PlayMenu;

public class ConsoleView extends View {

	
	@Override
	public void interact(AcceptorController acceptorController) {
		acceptorController.accept(this);
	}
	
	@Override
	public void interact(AcceptorController acceptorController) {
		acceptorController.accept(this);
	}

	public void visit(StartController startController) {
		new StartView().interact(startController);
	}

	public void visit(InGameController inGameController) {
		new PlayMenu(inGameController).execute();
	}

	public void visit(ResumeController resumeController) {
		new ResumeView().interact(resumeController);
	}


}
