package mastermind.distributed.dispatchers;

public enum FrameType {
    START,
    NEW_GAME,
    REDO,
    IS_REDOABLE,
    UNDO,
    IS_UNDOABLE,
    ADD_PROPOSED_COMBINATION,
    GET_COLORS,
    GET_ATTEMPTS,
    GET_BLACKS,
    GET_WHITES,
    IS_WINNER,
    IS_LOOSER,
    PROPOSAL_VIEW,
    CLOSE, 
    STARTNAME,
    TITLES;
   

    public static FrameType parser(String string) {
        for (FrameType frameType : FrameType.values()) {
            if (frameType.name().equals(string)) {
                return frameType;
            }
        }
        return null;
    }
}
