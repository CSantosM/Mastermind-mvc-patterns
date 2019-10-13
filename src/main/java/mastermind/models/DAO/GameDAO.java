package mastermind.models.DAO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import mastermind.models.Game;

public class GameDAO implements DAO{
	
	private final Game game;

    GameDAO(Game game) {
        this.game = game;
    }
	
	public void save(FileWriter fileWriter) {
		new SecretCombinatonDAO(this.game.getSecretCombination()).save(fileWriter);

		for (int i = 0; i < this.game.getProposedCombinations().size(); i++) {
			new ProposedCombinationDAO(this.game.getProposedCombinations().get(i)).save(fileWriter);
		}

		for (int i = 0; i < this.game.getResults().size(); i++) {
			new ResultDAO(this.game.getResults().get(i)).save(fileWriter);
		}
		try {
			fileWriter.write(this.game.getAttempts() + "\n");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void load(BufferedReader bufferedReader) {
		new SecretCombinatonDAO(this.game.getSecretCombination()).load(bufferedReader);
		for (int i = 0; i < this.game.getProposedCombinations().size(); i++) {
			new ProposedCombinationDAO(this.game.getProposedCombinations().get(i)).load(bufferedReader);
		}
		for (int i = 0; i < this.game.getResults().size(); i++) {
			new ResultDAO(this.game.getResults().get(i)).load(bufferedReader);
		}
		try {
			int attempts = Integer.parseInt(bufferedReader.readLine());
			this.game.setAttempts(attempts);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
