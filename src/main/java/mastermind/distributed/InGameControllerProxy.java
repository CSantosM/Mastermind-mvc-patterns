package mastermind.distributed;

import java.util.List;

import mastermind.controllers.InGameController;
import mastermind.distributed.dispatchers.TCPIP;
import mastermind.models.Session;
import mastermind.types.Color;
import mastermind.types.Error;

public class InGameControllerProxy extends InGameController {
    private final TCPIP tcpip;

	public InGameControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isredoable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isUndoable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Error addProposedCombination(List<Color> colors) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Color> getColors(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAttempts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBlacks(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWhites(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isWinner() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLooser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void proposalViewInteract() {
		// TODO Auto-generated method stub
		
	}

}
