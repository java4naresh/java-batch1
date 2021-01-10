package com.naresh.javabatch1;

interface Addition {
	int add(int num1, int num2);
}

class AdditionImpl implements Addition {

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
}

public class LabdaFunctionsExample {

	public static void main(String[] args) {
		Addition a = new AdditionImpl();
		System.out.println(a.add(10, 20));
		Addition a1 = new Addition() { // anonymous inner class
			@Override
			public int add(int num1, int num2) {
				return num1+num2;
			}
		};
		System.out.println(a1.add(20, 30));
		Addition a2 = (int num1, int num2) -> {
			return num1+num2;
		};
		System.out.println(a2.add(30, 30));
		Addition a3 = (num1, num2) -> {return num1+num2;};
		System.out.println(a3.add(50, 50));
		Addition a4 = (num1, num2) -> num1+num2;
		System.out.println(a4.add(80, 80));
		}

}
