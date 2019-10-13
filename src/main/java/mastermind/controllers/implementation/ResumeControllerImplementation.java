package mastermind.controllers.implementation;

import mastermind.controllers.ResumeController;
import mastermind.models.Session;

public class ResumeControllerImplementation extends ResumeController {

	public ResumeControllerImplementation(Session session) {
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
}
