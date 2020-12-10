package com.Triveni.Java;

public class Task {
	public static void main(String[] args) {

		String t1 = "456-SAV-157";
		t1 = t1.replaceAll("\\d", "");
		System.out.println("Account Type  " + t1);
		String t2 = "456-SAV-157";
		System.out.println("Account No " + t2.substring(8, 11));
		// System.out.println(t1.substring(8,11));

	}

}