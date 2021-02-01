package com.Ownpgm.Java;

public class Constructorexmple {
	int num1;
	double num2;
	public Constructorexmple()
	{
		num1=5;
		num2=5;
	}
	public Constructorexmple(int n,double n1)
	{
		num1=n;
		num2=n1;
	}
	//public Constructorexmple(int n,double n)
	//{
		//num1=n;
		//num2=n;
	//}


	public static void main(String[] args) {
		Constructorexmple obj =new Constructorexmple(7,7.8);
		System.out.println(obj.num1);
		System.out.println(obj.num2);


	}

}
