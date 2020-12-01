package com.naresh.package2;

import com.naresh.javabatch1.Arithmetic;
import com.naresh.javabatch1.Oracle;
import com.naresh.javabatch1.SoftwareIndustry;
import com.naresh.javabatch1.TCS;

public class Client extends Arithmetic{
	
	/*@Override
	public int addition(int num, int num2) {
	return 10;
	}*/

	public static void main(String[] args) {
		//Client arith = new Client();
		//arith.addition(10, 20);
<<<<<<< HEAD
		EmailRegistration eR = new EmailRegistration();

=======
		//EmailRegistration eR = new EmailRegistration();
>>>>>>> 8a9773773c4f0bef8af9f548e680643af95e8a7a
		/*System.out.println(eR.firstName);
		System.out.println(eR.lastName);
		System.out.println(eR.gender);
		System.out.println(eR.phoneNo);
		System.out.println(eR.address);
		
		eR.firstName = "Naresh";
		eR.lastName = "Kambala";
		System.out.println(eR.firstName);
		System.out.println(eR.lastName);
		System.out.println(eR.gender);
		System.out.println(eR.phoneNo);
		System.out.println(eR.address);*/
<<<<<<< HEAD

		eR.setFirstName("Naresh");
=======
		/*eR.setFirstName("Naresh");
>>>>>>> 8a9773773c4f0bef8af9f548e680643af95e8a7a
		eR.setLastName("Kambala");
		eR.setEmail("KambalaNaresh4java");
		System.out.println(eR.getFirstName());
		System.out.println(eR.getLastName());
		System.out.println(eR.getEmail());*/
		//26/11/2020
		/*BANK bank = new SBI();
		System.out.println(bank.interestRateCalculation());
		BANK hdfc = new HDFC();
		System.out.println(hdfc.interestRateCalculation());
		BANK axis = new AXIS();
		System.out.println(axis.interestRateCalculation());
		BANK myOwn = new MyOwn();
		System.out.println(myOwn.interestRateCalculation());*/
		//1/12/2020
		SoftwareIndustry si = new TCS();
		System.out.println(si.calculateSalary("Developer", 5));
		SoftwareIndustry oracle = new Oracle();
		System.out.println(oracle.calculateSalary("Developer", 5));
	}

}
