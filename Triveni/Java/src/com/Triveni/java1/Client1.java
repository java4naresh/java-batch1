package com.Triveni.java1;

import com.Triveni.Java.Irctc;

public class Client1 
{
	public static void main(String[] args)
	{
		System.out .println("------Create IRCTC Registration Form------");
		Irctc i1=new Irctc();
		
		i1.setFirstName("Triveni");
		System.out.println("FirstName "+i1.getFirstName());
		
		i1.setLastName("Ponnaganti");
		System.out.println("LastName "+i1.getLastName());
		
		i1.setEmailId("ponnagantitriveni");
		System.out.println("MailId  "+i1.getEmailId());
		
		i1.setMobileNo("7075929208");
		System.out.println("MobileNO "+i1.getMobileNo());
		

		i1.setAddress("Guntur");
		System.out.println("Address "+i1.getAddress());
		
		System.out.println("-------Registration Successful------");
		
		
		System.out.println("Please Enter UserName And Password");
		
		i1.setUserName("Tiru123");
		System.out.println("UserName  " + i1.getUserName());
		
		i1.setPassword("@veni666");
		System.out.println("Password  "+ i1.getPassword());
		
		i1.setOTP("562386");
		System.out.println("Please Enter OTP  "+ i1.getOTP());
		
		System.out.println("-------Successfully Login-----");
		
		System.out.println("Fill The Passenger Details");
		i1.setFullName("Ponnaganti Triveni");
		System.out.println("Enter Passenger FullName -- "+ i1.getFullName());
		
		i1.setAge("24");
		System.out.println("Enter Passenger Age--  "+ i1.getAge());
		
		i1.setGender("Female");
		System.out.println("Enter Gender-- "+ i1.getGender());
		
		i1.setBerthPreference("WindowSide");
		System.out.println("Select BerthPreference-- "+ i1.getBerthPreference());
		
		System.out.println("-------Dont Refresh The Page-----");
		System.out.println("-------Ticket Genarated-----");
		
	}
}
