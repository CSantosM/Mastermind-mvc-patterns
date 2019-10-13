package mastermind.models.DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import mastermind.models.SessionImplementation;
import mastermind.models.StateValue;

public class SessionImplementationDAO {

	public static final String EXTENSION = ".mastermind";

	public static final String DIRECTORY = System.getProperty("user.dir") + "/partidas";

	private static File directory;

	static {
		SessionImplementationDAO.directory = new File(SessionImplementationDAO.DIRECTORY);
		if (!SessionImplementationDAO.directory.exists()) {
			SessionImplementationDAO.directory.mkdir();
		}
	}

	private final SessionImplementation sessionImplementation;

	private final GameDAO gameDAO;

	public SessionImplementationDAO(SessionImplementation sessionImplementation) {
		this.sessionImplementation = sessionImplementation;
		this.gameDAO = new GameDAO(sessionImplementation.getGame());
	}

	public void load(String name) {
		this.sessionImplementation.setName(name);
		File file = new File(SessionImplementationDAO.directory, name);
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			this.gameDAO.load(bufferedReader);
			this.sessionImplementation.resetRegistry();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.sessionImplementation.setStateValue(StateValue.IN_GAME);
		if (this.sessionImplementation.isGameFinished()) {
			this.sessionImplementation.setStateValue(StateValue.FINAL);
		}
	}

	public void save() {
		this.save(this.sessionImplementation.getName());
	}

	public void save(String name) {
		if (!name.endsWith(SessionImplementationDAO.EXTENSION)) {
			name = name + SessionImplementationDAO.EXTENSION;
		}
		File file = new File(SessionImplementationDAO.directory, name);
		try {
			FileWriter fileWriter = new FileWriter(file);
			this.gameDAO.save(fileWriter);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String[] getGamesNames() {
		return SessionImplementationDAO.directory.list();
	}

	public boolean exists(String name) {
		for (String auxName : this.getGamesNames()) {
			if (auxName.equals(name + SessionImplementationDAO.EXTENSION)) {
				return true;
			}
		}
		return false;
	}

}
