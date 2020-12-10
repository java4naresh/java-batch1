package com.naresh.javabatch1;

public class TypeCasting {
	
	int num1;
	Integer num2;
	float num3;
	Float num4 = new Float("10.0");
	long num5;
	Long num6;
	double num7;
	Double num8;

	public static void main(String[] args) {

		int i = 10;
		double j = 20000000000000.0;
		System.out.println(i);
		System.out.println((float)i);
		System.out.println(j);
		System.out.println((long)j);
		System.out.println(getNum());
		System.out.println(getNum2());
		// int, float, long, double
		
		TypeCasting casting = new TypeCasting();
		System.out.println(casting);
		String s = "10";
		String s2 = "10.0";
		int numStr = Integer.parseInt(s);
		float floatStr = Float.parseFloat(s2);
		System.out.println(numStr);
		System.out.println(floatStr);
		
	}
	
	public static float getNum() {
		return 10;
	}
	
	public static int getNum2() {
		return (int) 10.20;
	}

	@Override
	public String toString() {
		return "TypeCasting [num1=" + num1 + ", \n" + ( "num2=" + num2 ) + "\", \n\"num3=" + num3 + ",\n "
				+ ("num4=" + num4) + "\", \n\"num5=" + num5 + ", \n"
				+ ("num6=" + num6) + "\", \n\"num7=" + num7 + ",\n "
				+ ("num8=" + num8 ) + "]";
	}

	
	
	

}
