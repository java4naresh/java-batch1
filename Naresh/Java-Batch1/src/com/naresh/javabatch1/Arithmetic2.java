package com.naresh.javabatch1;

public class Arithmetic2 extends Arithmetic {
	
	public int reminder(int num1, int num2) {
		return num1%num2;
	}
	
	@Override
	public int addition(int num, int num2) {
		System.out.println("Child");
		return num2+num;
		
	}
	
	public int addition(int num, int num2, int num3) {
		System.out.println("3-parameters");
		return 0;
	}
	
	public static void main(String[] args) {
		Arithmetic2 arith = new Arithmetic2();
		int sumValue = arith.addition(10, 5);
		System.out.println(sumValue);
		Arithmetic arithSup = new Arithmetic();
	    sumValue = arithSup.addition(10, 5);
		System.out.println(sumValue);

	}

}
