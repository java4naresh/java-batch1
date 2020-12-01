package com.naresh.javabatch1;

public class Client {
	
	public static void main(String[] args) {
		
		SoftwareCompany sc = new Consultancy();
		
		System.out.println(sc.basicSalary());
		System.out.println(sc.calculateSalary(5));
		
		AadharRegistrationConstructor ar = new AadharRegistrationConstructor();
		System.out.println(ar.getFirstName());
		AadharRegistrationConstructor ar1 = new AadharRegistrationConstructor("Jhansi", "Naresh","Female","9951742928","Hyderabad");
		System.out.println(ar1.getFirstName());	
		System.out.println(ar1.getLastName());
		System.out.println(ar1.getGender());
		System.out.println(ar1.getAddress());
		System.out.println(ar1.getPhoneNo());
	}

}
