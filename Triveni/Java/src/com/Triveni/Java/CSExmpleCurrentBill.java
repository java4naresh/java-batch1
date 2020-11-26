package com.Triveni.Java;

public class CSExmpleCurrentBill
{
	public static void main(String[] args) {

		int Unit = 50;
		if (Unit <=60) 
		{
			System.out.println("Current Bill is "+Unit * 10);
		} 
		else if (Unit > 10 && Unit <= 15)
		{
			System.out.println("Current Bill is "+Unit * 15);
		} 
		else if (Unit > 15 && Unit <= 20) 
		{
			System.out.println("Current Bill is "+Unit * 20);
		} 
		else 
		{

			System.out.println("Default Current Bill is "+Unit * 30);
		}

	}
}
