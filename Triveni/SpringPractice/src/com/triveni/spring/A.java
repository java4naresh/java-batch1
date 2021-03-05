package com.triveni.spring;

public class A {
	B b;
	public A() {
		System.out.println("A");
	}
	public A(B b) {


		this.b=b;
	}


	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	
}
