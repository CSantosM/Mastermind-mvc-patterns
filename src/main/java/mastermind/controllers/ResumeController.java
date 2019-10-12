package mastermind.controllers;

import mastermind.models.Session;

public class ResumeController extends AcceptorController {

	public ResumeController(Session session) {
		super(session);
	}
	
	public void resume(boolean newGame) {
		if (newGame) {
			this.session.gameClear();
			this.session.stateReset();
		} else {
			this.session.nextState();
		}
	}

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
