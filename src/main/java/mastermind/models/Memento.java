package mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Memento {

	private SecretCombination secretCombination;
	private int attempts;

	private List<ProposedCombination> proposedCombinations;

	private List<Result> results;

	public Memento() {
		this.results = new ArrayList<Result>();
		this.proposedCombinations = new ArrayList<ProposedCombination>();
	}

	public void addProposedCombination(ProposedCombination proposedCombinations) {
		this.proposedCombinations.add(proposedCombinations);
	}

	public void addResult(Result result) {
		this.results.add(result);
	}

	public SecretCombination getSecretCombination() {
		return secretCombination;
	}

	public void setSecretCombination(SecretCombination secretCombination) {
		this.secretCombination = secretCombination;
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	public List<ProposedCombination> getProposedCombinations() {
		return proposedCombinations;
	}

	public void setProposedCombinations(List<ProposedCombination> proposedCombinations) {
		this.proposedCombinations = proposedCombinations;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

}
