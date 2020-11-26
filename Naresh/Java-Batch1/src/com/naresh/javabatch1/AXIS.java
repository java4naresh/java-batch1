package com.naresh.javabatch1;

public class AXIS extends RBI {

	@Override
	public double interestRateCalculation() {
		double minimumRate = minimuInterestRate();
		double currentSituation = 3.5;
		return minimumRate+currentSituation;
	}

}
