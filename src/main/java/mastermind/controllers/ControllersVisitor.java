package mastermind.controllers;


public interface ControllersVisitor {

	void visit(StartController startController);

	void visit(InGameController inGameController);

	void visit(ResumeController continueController);

	void visit(SaveController saveController);
}
