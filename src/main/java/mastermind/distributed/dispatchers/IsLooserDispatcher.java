package mastermind.distributed.dispatchers;

import mastermind.controllers.implementation.InGameControllerImplementation;

public class IsLooserDispatcher extends Dispatcher {

	public IsLooserDispatcher(InGameControllerImplementation inGameControllerImplementation) {
		super(inGameControllerImplementation);
	}

	@Override
	public void dispatch() {
		((InGameControllerImplementation) this.acceptorController).isLooser();
	}

}
