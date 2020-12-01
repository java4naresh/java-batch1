package com.naresh.javabatch1;

public class TCS implements SoftwareIndustry {
	
	double fresherSalary = 350000;

	@Override
	public double hrBasicSalaryPerYear() {
		
		return 100000;
	}

	@Override
	public double developerBasicSalaryPerYear() {
		return 200000;
	}

	@Override
	public double testerBasicSalaryPerYear() {
		return 150000;
	}
	
	
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
