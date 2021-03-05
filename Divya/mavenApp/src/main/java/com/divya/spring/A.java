package com.divya.spring;

public class A
{
	B b;

	public A() 
	{
		super();
		System.out.println("A class");
	}

	public A(B b) {
		super();
		this.b = b;
	}


	public final B getB() {
		return b;
	}

	public final void setB(B b) {
		this.b = b;
	}

	
	

}
