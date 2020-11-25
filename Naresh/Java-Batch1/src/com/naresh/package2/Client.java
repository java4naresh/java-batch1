package com.naresh.package2;

import com.naresh.javabatch1.Arithmetic;
import com.naresh.javabatch1.EmailRegistration;

public class Client extends Arithmetic{
	
	/*@Override
	public int addition(int num, int num2) {
	return 10;
	}*/

	public static void main(String[] args) {
		//Client arith = new Client();
		//arith.addition(10, 20);
		EmailRegistration eR = new EmailRegistration();
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
		eR.setFirstName("Naresh");
		eR.setLastName("Kambala");
		eR.setEmail("KambalaNaresh4java");
		System.out.println(eR.getFirstName());
		System.out.println(eR.getLastName());
		System.out.println(eR.getEmail());

	}

}
