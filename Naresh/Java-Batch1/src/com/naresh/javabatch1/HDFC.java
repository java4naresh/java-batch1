package com.naresh.javabatch1;

public class HDFC extends RBI{

	@Override
	public double interestRateCalculation() {
		double minimumRate = minimuInterestRate();
		double currentSituation = 4;
		return minimumRate+currentSituation;
	}

}
