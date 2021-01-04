package com.Triveni.Java;

public class StaticVsNonstatic {
	static int i = 10;
	static int j = 20;
	int k= 30;
	int l=40;
	private char[] sub;

	int sub(int i, int j) {
		return i - j;
	}

	{
		System.out.println("Nonstatic block " + j);
	}

	static int add(int i, int j) {
		return i + j;
	}

	static {
		System.out.println("Static Block  " + i);
	}

	public static void main(String[] args) {
		System.out.println("Main");
		int add = i + j;
		System.out.println(add);

		StaticVsNonstatic s = new StaticVsNonstatic();
		int sub = i - j;
		System.out.println(sub);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(s.k);
		System.out.println(s.l);
		

	}

}
