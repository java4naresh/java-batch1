package com.veera.javaBasics;

public interface SoftwareIndustry {
	
	double hrBasicSalaryPerYear();
	
	double developerBasicSalaryPerYear();
	
	double testerBasicSalaryPerYear();
	
	double calculateSalary(String employeeType, float yearsOfExperience);

}
