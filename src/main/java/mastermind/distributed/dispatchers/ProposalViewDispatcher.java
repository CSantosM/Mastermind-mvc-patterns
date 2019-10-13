package mastermind.distributed.dispatchers;

import mastermind.controllers.implementation.InGameControllerImplementation;

public class ProposalViewDispatcher extends Dispatcher {

	public ProposalViewDispatcher(InGameControllerImplementation inGameControllerImplementation) {
		super(inGameControllerImplementation);
	}

	@Override
	public void dispatch() {
		((InGameControllerImplementation) this.acceptorController).proposalViewInteract();
	}

}
