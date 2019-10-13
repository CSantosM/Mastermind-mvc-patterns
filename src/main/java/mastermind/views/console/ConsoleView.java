package mastermind.views.console;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.InGameController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.SaveController;
import mastermind.controllers.StartController;
import mastermind.utils.Console;
import mastermind.utils.YesNoDialog;
import mastermind.views.MessageView;
import mastermind.views.View;
import mastermind.views.console.menu.PlayMenu;

public class ConsoleView extends View {

	
	@Override
	public void interact(AcceptorController acceptorController) {
		acceptorController.accept(this);
	}

	public void visit(StartController startController) {
		new StartView().interact(startController);
	}

	public void visit(InGameController inGameController) {
		new PlayMenu(inGameController).execute();
	}

	public void visit(ResumeController resumeController) {
		new ResumeView().interact(resumeController);
	}

	public void visit(SaveController saveController) {
		boolean save = new YesNoDialog().read(MessageView.SAVE.getMessage());
        String name = null;
        if (save) {
            if (saveController.hasName()) {
                saveController.save();
            } else {
                boolean exists = false;
                do {
                    name = new Console().readString(MessageView.NAME.getMessage());
                    exists = saveController.exists(name);
                    if (exists) {
                        new Console().writeln(MessageView.NAME_EXISTS.getMessage());
                    }
                } while (exists);
                saveController.save(name);
            }
        }
        saveController.next();
		
	}


}
