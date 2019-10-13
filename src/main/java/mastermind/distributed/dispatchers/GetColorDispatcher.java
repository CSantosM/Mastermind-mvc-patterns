package mastermind.distributed.dispatchers;

import mastermind.controllers.implementation.InGameControllerImplementation;

public class GetColorDispatcher extends Dispatcher {

	public GetColorDispatcher(InGameControllerImplementation inGameControllerImplementation) {
		super(inGameControllerImplementation);
	}

	@Override
	public void dispatch() {
		int position = this.tcpip.getPosition();
		((InGameControllerImplementation) this.acceptorController).getColors(position);

	}

}
