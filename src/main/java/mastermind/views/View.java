package mastermind.views;

import mastermind.controllers.Controller;
import mastermind.controllers.ControllersVisitor;
import mastermind.controllers.ProposalController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;

public abstract class View implements ControllersVisitor {

	public void interact(Controller controller) {
		controller.accept(this);
	}

	public abstract void visit(ProposalController proposalController);

	public abstract void visit(StartController startController);

	public abstract void visit(ResumeController resumeController);

}
