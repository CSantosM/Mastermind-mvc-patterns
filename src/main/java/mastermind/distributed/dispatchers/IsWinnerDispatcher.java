package mastermind.distributed.dispatchers;

import mastermind.controllers.implementation.InGameControllerImplementation;

public class IsWinnerDispatcher extends Dispatcher {

	public IsWinnerDispatcher(InGameControllerImplementation inGameControllerImplementation) {
		super(inGameControllerImplementation);
	}

	@Override
	public void dispatch() {
		((InGameControllerImplementation) this.acceptorController).isWinner();
	}

}
