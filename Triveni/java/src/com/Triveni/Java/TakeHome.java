package com.Triveni.Java;

public class TakeHome implements MonthlyPay
{
	public  double grossIncome()
	{
		 double regularincome=47000;
		 double benifit=1000;
		 return regularincome+benifit;
	}
	public  double grossdeduction()
	{
		double regulardeduction=4000;
		double stationarydeduction=2000;
		return stationarydeduction+regulardeduction;
		
		
	}
	public  double Netpay()
	{
		
		int grossIncome=48000;
		int grossdeduction=6000;
		return grossIncome-grossdeduction;
	}

}
