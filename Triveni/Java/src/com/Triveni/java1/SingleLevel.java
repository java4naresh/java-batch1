package com.Triveni.java1;

public class SingleLevel 
{
	public static void main(String[] args)
	{
		Parent p1=new Parent(5);
		System.out.println(p1.i);
		Child c1=new Child(7,9);
		System.out.println(c1.i);
		System.out.println(c1.j);
	}
}
