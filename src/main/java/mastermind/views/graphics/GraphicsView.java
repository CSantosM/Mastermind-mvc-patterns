package mastermind.views.graphics;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.InGameController;
import mastermind.controllers.ProposalController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.views.View;

public class GraphicsView extends View {

	private GameView gameView;

	public GraphicsView() {
		this.gameView = new GameView();
	}

	public void visit(StartController startController) {
		this.gameView.interact(startController);
	}

	public void visit(ProposalController proposalController) {
		this.gameView.interact(proposalController);
	}

	public void visit(ResumeController resumeController) {
		ResumeDialog resumeDialog = new ResumeDialog();
		resumeController.resume(resumeDialog.isNewGame());
		if (resumeDialog.isNewGame()) {
			this.gameView = new GameView();
		} else {
			this.gameView.setVisible(false);
			System.exit(0);
		}
	}

	@Override
	public void interact(AcceptorController acceptorcontroller) {
		
	}

	public void visit(InGameController inGameController) {
		// TODO Auto-generated method stub
		
	}

}
