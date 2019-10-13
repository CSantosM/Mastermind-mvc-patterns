package mastermind.views.console.menu;

public enum CommandTitle {
	
	REDO_COMMAND("Redo previous Proposal"),
    PROPOSE_COMMAND("Propose Combination"),
    UNDO_COMMAND("Undo previous Proposal"),
    NEWGAME_COMMAND("Start a new game"),
    OPENGAME_COMMAND("Open a new game"),
    EXIT_COMMAND("Exit game");

    private String title;

    CommandTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}
