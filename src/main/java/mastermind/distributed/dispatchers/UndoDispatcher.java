package mastermind.distributed.dispatchers;

import mastermind.controllers.implementation.InGameControllerImplementation;

public class UndoDispatcher extends Dispatcher {

    public UndoDispatcher(InGameControllerImplementation playControllerImplementation) {
        super(playControllerImplementation);
    }

    @Override
    public void dispatch() {
        ((InGameControllerImplementation) this.acceptorController).undo();
    }

}

