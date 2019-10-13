package mastermind.models.DAO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import mastermind.models.Combination;
import mastermind.models.SecretCombination;
import mastermind.types.Color;

public class SecretCombinatonDAO implements DAO {

	protected final SecretCombination secretCombination;

	public SecretCombinatonDAO(SecretCombination secretCombination) {
		this.secretCombination = secretCombination;
	}

	public void save(FileWriter fileWriter) {
		try {
			fileWriter.write(Combination.getWidth() + "\n");
			for (int i = 0; i < Combination.getWidth(); i++) {
				fileWriter.write(this.secretCombination.getColors().get(i).name());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void load(BufferedReader bufferedReader) {
		try {
			this.secretCombination.getColors().clear();
			for (int i = 0; i < Combination.getWidth(); i++) {
				Color color = Color.valueOf(bufferedReader.readLine());
				this.secretCombination.getColors().add(color);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
