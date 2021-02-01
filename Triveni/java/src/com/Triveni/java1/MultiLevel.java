package com.Triveni.java1;

public class MultiLevel 
{
	public static void main(String[] args)
	{
		Parent p1=new Parent(5);
		System.out.println("parent class value " +p1.i);
		Child c1=new Child(7,9);
		System.out.println("Child class 1 value "+c1.i);
		System.out.println("Child class 2 value "+c1.j);
		Child1 c2=new Child1(8,6,9);
		System.out.println("Child1 class 1 value "+c2.i);
		System.out.println("Child1 class 2 value "+c2.j);
		System.out.println("Child1 class 3 value "+c2.k);
	}

}
