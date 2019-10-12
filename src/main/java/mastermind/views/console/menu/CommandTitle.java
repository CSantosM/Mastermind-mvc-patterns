package mastermind.views.console.menu;

public enum CommandTitle {
	
	REDO_COMMAND("Redo previous Proposal"),
    PROPOSE_COMMAND("Propose Combination"),
    UNDO_COMMAND("Undo previous Proposal");

    private String title;

    CommandTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}
