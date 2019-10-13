package mastermind.distributed;

import mastermind.controllers.implementation.LogicImplementation;
import mastermind.distributed.dispatchers.AddProposedDispatcher;
import mastermind.distributed.dispatchers.DispatcherPrototype;
import mastermind.distributed.dispatchers.FrameType;
import mastermind.distributed.dispatchers.GetAttempsDispatcher;
import mastermind.distributed.dispatchers.GetBlacksDispatcher;
import mastermind.distributed.dispatchers.GetColorDispatcher;
import mastermind.distributed.dispatchers.GetWhitesDispatcher;
import mastermind.distributed.dispatchers.IsLooserDispatcher;
import mastermind.distributed.dispatchers.IsWinnerDispatcher;
import mastermind.distributed.dispatchers.ProposalViewDispatcher;
import mastermind.distributed.dispatchers.RedoDispatcher;
import mastermind.distributed.dispatchers.RedoableDispatcher;
import mastermind.distributed.dispatchers.ResumeDispatcher;
import mastermind.distributed.dispatchers.StartDispatcher;
import mastermind.distributed.dispatchers.UndoDispatcher;
import mastermind.distributed.dispatchers.UndoableDispatcher;

public class LogicImplementationServer extends LogicImplementation {

	public void createDispatchers(DispatcherPrototype dispatcherPrototype) {

		dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
		dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeControllerImplementation));
		dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.inGameControllerImplementation));
		dispatcherPrototype.add(FrameType.IS_REDOABLE, new RedoableDispatcher(this.inGameControllerImplementation));
		dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.inGameControllerImplementation));
		dispatcherPrototype.add(FrameType.IS_UNDOABLE, new UndoableDispatcher(this.inGameControllerImplementation));
		dispatcherPrototype.add(FrameType.ADD_PROPOSED_COMBINATION, new AddProposedDispatcher(this.inGameControllerImplementation));
		dispatcherPrototype.add(FrameType.GET_COLORS, new GetColorDispatcher(this.inGameControllerImplementation));
		dispatcherPrototype.add(FrameType.GET_ATTEMPTS, new GetAttempsDispatcher(this.inGameControllerImplementation));
		dispatcherPrototype.add(FrameType.GET_BLACKS, new GetBlacksDispatcher(this.inGameControllerImplementation));
		dispatcherPrototype.add(FrameType.GET_WHITES, new GetWhitesDispatcher(this.inGameControllerImplementation));
		dispatcherPrototype.add(FrameType.IS_WINNER, new IsWinnerDispatcher(this.inGameControllerImplementation));
		dispatcherPrototype.add(FrameType.IS_LOOSER, new IsLooserDispatcher(this.inGameControllerImplementation));
		dispatcherPrototype.add(FrameType.PROPOSAL_VIEW, new ProposalViewDispatcher(this.inGameControllerImplementation));
	}

}
