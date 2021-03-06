package mastermind.views.console.menu;

import mastermind.controllers.InGameController;

public class ProposeCommand extends Command {

	public ProposeCommand(InGameController inGameController) {
		super(CommandTitle.PROPOSE_COMMAND.getTitle(), inGameController);
	}

	@Override
	protected void execute() {
		((InGameController) this.acceptorController).proposalViewInteract();

	}

	@Override
	public boolean isActive() {
		return true;
	}

}
