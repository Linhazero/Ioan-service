package service;

public class BrazilInterestService implements InterestService {
	
	private double interestRate;

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	@Override
	public double getinterestRate() {
		return interestRate;
	}
	
	


}
