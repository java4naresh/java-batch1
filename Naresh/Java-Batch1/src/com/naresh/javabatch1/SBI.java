package com.naresh.javabatch1;

public class SBI extends RBI {
	

	@Override
	public double interestRateCalculation() {
		double minimumRate = minimuInterestRate();
		double currentSituation = 3;
		return minimumRate+currentSituation;
	}

}
