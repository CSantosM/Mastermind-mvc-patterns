package mastermind.controllers.implementation;

import mastermind.controllers.StartController;
import mastermind.models.Session;
import mastermind.models.SessionImplementation;
import mastermind.models.DAO.SessionImplementationDAO;

public class StartControllerImplementation extends StartController {

	private final SessionImplementationDAO sessionImplementationDAO;

	public StartControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
		super(session);
		this.sessionImplementationDAO = sessionImplementationDAO;

	}

	@Override
	public void start() {
		((SessionImplementation) this.session).nextState();
	}

	@Override
	public void start(String name) {
		this.sessionImplementationDAO.load(name);
	}

	@Override
	public String[] getGamesNames() {
		return this.sessionImplementationDAO.getGamesNames();
	}

}
