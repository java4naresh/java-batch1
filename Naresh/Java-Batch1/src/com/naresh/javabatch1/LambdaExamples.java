package com.naresh.javabatch1;

interface A {
	int add(int num1, int num2);
}

class AImpl implements A {

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
}

public class LambdaExamples {

	public static void main(String[] args) {
		
     A obj;
     obj = new AImpl();
     System.out.println(obj.add(10, 20));
     obj = new A() {

		@Override
		public int add(int num1, int num2) {
			return num1+num2;
		}
    	 
     };
     System.out.println(obj.add(10, 20));
     obj = (int num1, int num2) -> {
    	 return num1+num2;
     };
     System.out.println(obj.add(10, 20));
     obj = (num1, num2) -> {
    	 return num1+num2;
     };
     System.out.println(obj.add(10, 20));
     obj = (num1, num2) -> num1+num2;
     System.out.println(obj.add(20, 30));
	}

}
