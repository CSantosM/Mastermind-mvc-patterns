package mastermind.controllers.implementation;

import mastermind.controllers.Logic;
import mastermind.models.SessionImplementation;
import mastermind.models.StateValue;
import mastermind.models.DAO.SessionImplementationDAO;

public class LogicImplementation extends Logic {

	protected StartControllerImplementation startControllerImplementation;

	protected InGameControllerImplementation inGameControllerImplementation;

	protected SaveControllerImplementation saveControllerImplementation;

	protected ResumeControllerImplementation resumeControllerImplementation;

	public LogicImplementation() {
		this.session = new SessionImplementation();
		SessionImplementationDAO sessionImplementationDAO = new SessionImplementationDAO(
				(SessionImplementation) this.session);
		this.startControllerImplementation = new StartControllerImplementation(this.session, sessionImplementationDAO);
		this.inGameControllerImplementation = new InGameControllerImplementation(this.session);
		this.saveControllerImplementation = new SaveControllerImplementation(this.session, sessionImplementationDAO);
		this.resumeControllerImplementation = new ResumeControllerImplementation(this.session);

		this.acceptorControllers.put(StateValue.INITIAL, this.startControllerImplementation);
		this.acceptorControllers.put(StateValue.IN_GAME, this.inGameControllerImplementation);
		this.acceptorControllers.put(StateValue.FINAL, this.resumeControllerImplementation);
		this.acceptorControllers.put(StateValue.EXIT, null);
	}
}
