package mastermind.distributed.dispatchers;

import mastermind.controllers.implementation.InGameControllerImplementation;

public class GetWhitesDispatcher extends Dispatcher {

	public GetWhitesDispatcher(InGameControllerImplementation inGameControllerImplementation) {
		super(inGameControllerImplementation);

	}

	@Override
	public void dispatch() {
		int position = this.tcpip.getPosition();
		((InGameControllerImplementation) this.acceptorController).getWhites(position);
	}

}
