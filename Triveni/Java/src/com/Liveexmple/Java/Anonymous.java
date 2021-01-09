package com.Liveexmple.Java;

public abstract class Anonymous implements Multiplication {
	Multiplication m1=new Multiplication() {
	@Override
	public int mul(int num1, int num2) {
		return num1*num2;
	}
	};
	system.out.println(m1.mul(20,30));
	
	// Lambda Function
	Multiplication m2 = (int num1, int num2) -> {
		return num1 * num2;
	};system.out.println(m2.mul(20,30));

	// with out data types Lambda functions
	Multiplication m3 = (num1, num2) -> {
		return num1 * num2;
	};system.out.println(m3.mul(20,30));

	// with Out return Type Lambda functions
	Multiplication m4=( num1,num2)->{
			 num1*num2;
				};
				system.out.println(m4.mul(20,30));

}
