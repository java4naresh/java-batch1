package com.Triveni.Java;

public class Arthematic 
{
	public int addition(int a,int b)
	{
		return a+b;
	}
	public double substraction(double a,double b)
	{
		return a-b;
	}
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	public int division(int a,int b)
	{
		return a/b;
	}
	public int modulo(int a,int b) 
	{
		return a%b;
	}
	public static void main(String[] args)
	{
		Arthematic ari = new Arthematic();
		int sum = ari.addition(25, 20);
		double sub = ari.substraction(66.5, 45.5);
		int mul = ari.multiplication(55, 65);
		int div = ari.division(50, 10);
		int mod = ari.modulo(10, 5);
		System.out.println("Addition Value = "+sum);
		System.out.println("Substraction Value = "+sub);
		System.out.println("Multiplication Value = "+mul);
		System.out.println("Division Value = "+div);
		System.out.println("Modulo Value = "+mod);
	}

}

