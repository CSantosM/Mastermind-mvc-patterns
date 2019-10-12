package mastermind.controllers;

import mastermind.models.Session;

public class StartController extends AcceptorController {

	public StartController(Session session) {
		super(session);
	}
	
	public void start() {
		this.session.nextState();
	}
	
	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
