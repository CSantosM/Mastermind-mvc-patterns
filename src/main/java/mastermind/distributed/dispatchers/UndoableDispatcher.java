package mastermind.distributed.dispatchers;

import mastermind.controllers.implementation.InGameControllerImplementation;

public class UndoableDispatcher extends Dispatcher {

    public UndoableDispatcher(InGameControllerImplementation playControllerImplementation) {
        super(playControllerImplementation);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((InGameControllerImplementation) this.acceptorController).isUndoable());
    }

}

