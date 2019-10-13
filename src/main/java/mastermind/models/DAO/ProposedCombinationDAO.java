package mastermind.models.DAO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import mastermind.models.Combination;
import mastermind.models.ProposedCombination;
import mastermind.types.Color;

public class ProposedCombinationDAO  implements DAO{

	protected final ProposedCombination proposedCombination;
	
	public ProposedCombinationDAO(ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
	}

	public void save(FileWriter fileWriter) {
		try {
			fileWriter.write(Combination.getWidth() + "\n");
			for (int i = 0; i < Combination.getWidth(); i++) {
				fileWriter.write(this.proposedCombination.getColors().get(i).name());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void load(BufferedReader bufferedReader) {
		try {
			this.proposedCombination.getColors().clear();
			for (int i = 0; i < Combination.getWidth(); i++) {
				Color color = Color.valueOf(bufferedReader.readLine());
				this.proposedCombination.getColors().add(color);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
