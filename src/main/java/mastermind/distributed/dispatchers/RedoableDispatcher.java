package mastermind.distributed.dispatchers;

import mastermind.controllers.implementation.InGameControllerImplementation;

public class RedoableDispatcher extends Dispatcher{
	
	 public RedoableDispatcher(InGameControllerImplementation playControllerImplementation) {
	        super(playControllerImplementation);
	    }

	    @Override
	    public void dispatch() {
	        this.tcpip.send(((InGameControllerImplementation) this.acceptorController).isredoable());
	    }

}
