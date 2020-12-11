package com.Triveni.Java;

public class Stringclass {
	String name;

	Stringclass(String name) {
		this.name = name;

	}

	public static void main(String[] args) {
		int i, j;
		Stringclass s1 = new Stringclass("Ponnaganti Triveni");
		System.out.println(s1.name);
		/*
		 * for( i=s1.name.length()-1;i>=0;i--) { System.out.print(s1.name.charAt(i));
		 * 
		 * }
		 */

		String[] s = s1.name.split(" ");
		for (int j1 = 0; j1 < s.length; j1++) {
			String a = s[j1];
			StringBuffer sb = new StringBuffer(a);
			System.out.print(sb.reverse());
			System.out.println(sb.hashCode());

		}

	}

}
