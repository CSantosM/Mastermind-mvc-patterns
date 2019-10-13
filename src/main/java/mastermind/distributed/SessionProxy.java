package mastermind.distributed;

import java.util.ArrayList;
import java.util.List;

import mastermind.distributed.dispatchers.FrameType;
import mastermind.distributed.dispatchers.TCPIP;
import mastermind.models.Session;
import mastermind.models.StateValue;
import mastermind.types.Color;

public class SessionProxy implements Session{
	
    private final TCPIP tcpip;

	public SessionProxy(TCPIP tcpip) {
		this.tcpip = tcpip;
	}

	public int getGameWidth() {
		return 0;
	}

	public void nextState() {
		// TODO Auto-generated method stub
		
	}

	public void gameClear() {
		// TODO Auto-generated method stub
		
	}

	public void stateReset() {
		// TODO Auto-generated method stub
		
	}

	public boolean isGameLooser() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isGameWinner() {
		// TODO Auto-generated method stub
		return false;
	}

	public void addProposedCombination(List<Color> colors) {
		// TODO Auto-generated method stub
		
	}

	public int getAttempts() {
		this.tcpip.send(FrameType.GET_WHITES.name());
		return this.tcpip.receiveInt();
	}

	public List<Color> getColors(int position) {
		this.tcpip.send(FrameType.GET_COLORS.name());
		this.tcpip.send(position);
		int numColors = this.tcpip.receiveInt();
        List<Color> colors = new ArrayList<Color>();
        for (int i = 0; i < numColors; i++) {
            colors.add(this.tcpip.receiveColor());
        }
        return colors;
	}

	public int getBlacks(int position) {
		this.tcpip.send(FrameType.GET_BLACKS.name());
		this.tcpip.send(position);
		return this.tcpip.receiveInt();
	}

	public int getWhites(int position) {
		this.tcpip.send(FrameType.GET_WHITES.name());
		this.tcpip.send(position);
		return this.tcpip.receiveInt();
	}


	public void redo() {
		// TODO Auto-generated method stub
		
	}

	public boolean isRedoable() {
		// TODO Auto-generated method stub
		return false;
	}

	public void undo() {
		// TODO Auto-generated method stub
		
	}

	public boolean isUndoable() {
		// TODO Auto-generated method stub
		return false;
	}

	public StateValue getValueState() {
		// TODO Auto-generated method stub
		return null;
	}

}
