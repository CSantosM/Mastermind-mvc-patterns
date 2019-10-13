package mastermind.models.DAO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import mastermind.models.Result;

public class ResultDAO implements DAO {

	protected final Result result;

	ResultDAO(Result result) {
		this.result = result;
	}

	public void save(FileWriter fileWriter) {
		try {
			fileWriter.write(this.result.getBlacks() + "\n");
			fileWriter.write(this.result.getWhites() + "\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void load(BufferedReader bufferedReader) {
		try {
			int whites = Integer.parseInt(bufferedReader.readLine());
			int blacks = Integer.parseInt(bufferedReader.readLine());

			this.result.setWhites(whites);
			this.result.setBlacks(blacks);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
