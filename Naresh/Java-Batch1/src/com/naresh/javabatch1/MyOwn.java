package com.naresh.javabatch1;

public class MyOwn implements BANK{

	public double minimuInterestRate() {
		return 2.0;
	}

	public double interestRateCalculation() {
		double minimumRate = minimuInterestRate();
		double currentSituation = 3;
		return minimumRate+currentSituation;
	}

}
