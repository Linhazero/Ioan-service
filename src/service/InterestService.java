package service;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getinterestRate();
	default double payment(double amount, int months) {
		if (months < 1 ) {
			throw new InvalidParameterException("months must be greater than zero");
		}
		return amount * Math.pow(1 + getinterestRate()/100, months);
	
	}
}
