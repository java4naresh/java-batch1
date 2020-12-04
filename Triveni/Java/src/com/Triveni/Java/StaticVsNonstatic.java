package com.Triveni.Java;

public class StaticVsNonstatic 
{
	static   int i=20;
	static int j=10;
	private char[] sub;
	 int sub(int i,int j)
	{
		return i-j;
	}
 
	{
		System.out.println("Nonstatic block "+ j);
	}
	static int add(int i,int j)
	{
		return i+j;
	}
	static 
	{
		System.out.println("Static Block  "+ i);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main");
		int add =i+j;
		System.out.println(add);
		
		StaticVsNonstatic s=new StaticVsNonstatic();
		int sub=i-j;
		System.out.println(sub);		 
		
		
	}

}
