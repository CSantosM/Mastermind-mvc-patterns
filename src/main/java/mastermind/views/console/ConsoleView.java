package mastermind.views.console;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.InGameController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.views.View;
import mastermind.views.console.menu.PlayMenu;

public class ConsoleView extends View {

	private StartView startView;

	private ProposalView proposalView;

	private ResumeView resumeView;

	public ConsoleView() {
		this.startView = new StartView();
		this.proposalView = new ProposalView();
		this.resumeView = new ResumeView();
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
		this.resumeView.interact(resumeController);
	}


}
