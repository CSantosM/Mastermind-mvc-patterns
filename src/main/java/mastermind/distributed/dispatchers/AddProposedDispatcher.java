package mastermind.distributed.dispatchers;

import java.util.List;

import mastermind.controllers.implementation.InGameControllerImplementation;
import mastermind.types.Color;

public class AddProposedDispatcher extends Dispatcher {

	public AddProposedDispatcher(InGameControllerImplementation inGameControllerImplementation) {
		super(inGameControllerImplementation);

	}

	@Override
	public void dispatch() {
		List<Color> colors = this.tcpip.getColors();
		((InGameControllerImplementation) this.acceptorController).addProposedCombination(colors);
	}

}
