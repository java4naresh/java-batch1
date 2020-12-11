package com.Triveni.Java;

public class Typecasting {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		System.out.println((float) i);
		System.out.println((double) i);
		System.out.println((long) i);

		/// AutoBoxing & Autounboxing
		int j = 10;
		double k = 566778.9009;
		System.out.println((long) k);
		System.out.println((double) k);
		System.out.println((float) k);
		System.out.println(getNum());
		System.out.println(getNum2());

	}

	public static float getNum() {
		return (float) 10;
	}

	public static int getNum2() {
		return (int) 12.12;
	}

}
