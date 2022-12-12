package service;

public class UsaInterestService implements InterestService{
	
	private double interestRate;

	public UsaInterestService(double interestRate) {
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
