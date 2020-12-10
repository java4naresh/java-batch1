package com.Triveni.Java;

public class Substring 
{
	
	public static void main(String[] args)
	{	
	// using substring Method
		System.out.println("By Using Substring Method");
	String courses="Java Angular Mysqual";
	System.out.println(courses.substring(0, 4));
	System.out.println(courses.substring(5, 12));
	System.out.println(courses.substring(13, 20));
	
	// using for each loop
	System.out.println("By Using ForEach Loop");
	String[] courses1= {"Java", "Angular"," Mysqual"};
	for(String string:courses1)
	{
		System.out.println(string);
	}
	
	}
	

}
