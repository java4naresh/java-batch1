package com.naresh.javabatch1;

public class Consultancy extends Oracle {

	@Override
	public double basicSalary() {
		return 40000;
	}

	@Override
	public double foodAllowvances() {
		return 2000;
	}
	public double calculateSalary(float yearsOfExperience) {
		return yearsOfExperience*basicSalary()+foodAllowvances()+internet();

	}
}
