package mastermind.distributed.dispatchers;

import mastermind.controllers.implementation.InGameControllerImplementation;

public class RedoDispatcher extends Dispatcher {

    public RedoDispatcher(InGameControllerImplementation playControllerImplementation) {
        super(playControllerImplementation);
    }

    @Override
    public void dispatch() {
        ((InGameControllerImplementation) this.acceptorController).redo();
    }

}
