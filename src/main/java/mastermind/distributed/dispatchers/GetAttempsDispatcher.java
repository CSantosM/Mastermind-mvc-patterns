package mastermind.distributed.dispatchers;

import java.util.List;

import mastermind.controllers.implementation.InGameControllerImplementation;
import mastermind.types.Color;

public class GetAttempsDispatcher extends Dispatcher {

	public GetAttempsDispatcher(InGameControllerImplementation inGameControllerImplementation) {
		super(inGameControllerImplementation);

	}

	@Override
	public void dispatch() {
		((InGameControllerImplementation) this.acceptorController).getAttempts();
	}

}
