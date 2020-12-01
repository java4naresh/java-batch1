package com.naresh.javabatch1;

public interface SoftwareIndustry {
	
	double hrBasicSalaryPerYear();
	
	double developerBasicSalaryPerYear();
	
	double testerBasicSalaryPerYear();
	
	double calculateSalary(String employeeType, float yearsOfExperience);

}
