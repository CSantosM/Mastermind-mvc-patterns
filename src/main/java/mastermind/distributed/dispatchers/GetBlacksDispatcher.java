package mastermind.distributed.dispatchers;

import mastermind.controllers.implementation.InGameControllerImplementation;

public class GetBlacksDispatcher extends Dispatcher {

	public GetBlacksDispatcher(InGameControllerImplementation inGameControllerImplementation) {
		super(inGameControllerImplementation);

	}

	@Override
	public void dispatch() {
		int position = this.tcpip.getPosition();
		((InGameControllerImplementation) this.acceptorController).getBlacks(position);
	}

}
