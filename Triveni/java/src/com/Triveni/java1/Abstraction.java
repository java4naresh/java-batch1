package com.Triveni.java1;

import com.Triveni.Java.MonthlyPay;
import com.Triveni.Java.TakeHome;
public class Abstraction 
{
	public static void main(String[]args)
	{
		MonthlyPay salary=new TakeHome();
		System.out.println("Actually salary is " + 47000);
		System.out.println("Benifits Added Salary "+salary.grossIncome());
		System.out.println("GrossDedution amount is  "+salary.grossdeduction());
		System.out.println("Salary Genarated "+salary.Netpay());
	}

}
