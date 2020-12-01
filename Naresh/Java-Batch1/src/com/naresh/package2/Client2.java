package com.naresh.package2;

import com.naresh.javabatch1.EmailRegistration;

public class Client2 {

	public static void main(String[] args) {
		//EmailRegistration er = new EmailRegistration("Naresh", "Kambala", "Male", "9951288766", "Hyd", "kambalanaresh4java@gmail.com");
		EmailRegistration er2 = new EmailRegistration();
		EmailRegistration er = new EmailRegistration("Naresh", "Kambala", "Male");
		System.out.println(er.getFirstName());
		System.out.println(er.getLastName());
		System.out.println(er.getEmail());
		System.out.println(er.getAddress());
		System.out.println(er.getGender());
		System.out.println(er.getPhoneNo());

	}

}
