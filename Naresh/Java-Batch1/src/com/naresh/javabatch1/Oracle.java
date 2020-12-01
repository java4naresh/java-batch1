package com.naresh.javabatch1;

public class Oracle implements SoftwareIndustry {
	
	double fresherSalary = 400000;

	@Override
	public double hrBasicSalaryPerYear() {
		
		return 200000;
	}

	@Override
	public double developerBasicSalaryPerYear() {
		
		return 300000;
	}

	@Override
	public double testerBasicSalaryPerYear() {
		
		return 250000;
	}

	@Override
	public double calculateSalary(String employeeType, float yearsOfExperience) {
		if(yearsOfExperience > 1) {
			if("Developer".equals(employeeType)) {
				return developerBasicSalaryPerYear()*yearsOfExperience;
			} else if("Tester".equals(employeeType)) {
				return testerBasicSalaryPerYear()*yearsOfExperience;
			} else {
				return hrBasicSalaryPerYear()*yearsOfExperience;
			}
			} else {
				/*if("Developer".equals(employeeType)) {
					return developerBasicSalaryPerYear();
				} else if("Tester".equals(employeeType)) {
					return testerBasicSalaryPerYear();
				} else {
					return hrBasicSalaryPerYear();
				}*/
				return fresherSalary;
			}
	}

}
