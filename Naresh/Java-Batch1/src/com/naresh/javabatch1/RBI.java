package com.naresh.javabatch1;

public abstract class RBI implements BANK {
	
	public double minimuInterestRate() {
		return 3.0;
	}
	
	public abstract double interestRateCalculation();

}
