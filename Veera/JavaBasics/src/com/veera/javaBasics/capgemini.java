package com.veera.javaBasics;

public class capgemini implements SoftwareIndustry {
	double fresherSalary = 350000;
	@Override
	public double hrBasicSalaryPerYear() {
		// TODO Auto-generated method stub
		return 150000;
	}

	@Override
	public double developerBasicSalaryPerYear() {
		// TODO Auto-generated method stub
		return 200000;
	}

	@Override
	public double testerBasicSalaryPerYear() {
		// TODO Auto-generated method stub
		return 100000;
	}

	@Override
	public double calculateSalary(String employeeType, float yearsOfExperience) {
		// TODO Auto-generated method stub
		if(yearsOfExperience > 1) {
			if("Developer".equals(employeeType)) {
				System.out.println("developerBasicSalaryPerYear()=="+developerBasicSalaryPerYear()*yearsOfExperience);
				return developerBasicSalaryPerYear()*yearsOfExperience;
			} else if("Tester".equals(employeeType)) {
				System.out.println("testerBasicSalaryPerYear()*yearsOfExperience=="+testerBasicSalaryPerYear()*yearsOfExperience);
				return testerBasicSalaryPerYear()*yearsOfExperience;
			} else {
				System.out.println(hrBasicSalaryPerYear()*yearsOfExperience);
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
				System.out.println("fresherSalary"+fresherSalary);
				return fresherSalary;
			}
		
	}

}
