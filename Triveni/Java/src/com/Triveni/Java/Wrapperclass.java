package com.Triveni.Java;

public class Wrapperclass {
	public static void main(String[] args) {
		String s = "10";
		Integer numstr = Integer.parseInt(s);
		System.out.println(numstr);

		String s1 = "10";
		Float numstr1 = Float.parseFloat(s1);
		System.out.println(numstr1);

		String s2 = "10";
		Double numstr2 = Double.parseDouble(s1);
		System.out.println(numstr2);

		String s3 = "10";
		Long numstr3 = Long.parseLong(s1);
		System.out.println(numstr3);
	}
}
