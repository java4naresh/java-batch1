package com.naresh.javabatch1;

public class Arithmetic {
	
	public int addition(int num1, int num2) {
		//System.out.println(num1+num2);
		return num1+num2;
	}
	
	public void substraction(int num1, int num2) {
		System.out.println(num1-num2);
	}
	
	public void multiplication(int num1, int num2) {
		System.out.println(num1*num2);
	}
	
	public void division(int num1, int num2) {
		System.out.println(num1/num2);
	}

	public static void main(String[] args) {
		Arithmetic arith = new Arithmetic();
		int sumValue = arith.addition(10, 5);
		System.out.println(sumValue);
		//arith.substraction(10, 5);
		//arith.multiplication(10, 5);
		//arith.division(10, 5);

	}

}
