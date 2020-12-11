package com.Triveni.Java;

public class Internmethod {
	public static void main(String[] args) {
		// intern method uses to indentify the string literal value//

		String s1 = "Java";// this value store heap area in string constant pool area
		String s2 = "Java";// s1,s2 both are string literal
		String s3 = new String("Java").intern();// this value store heap area
		// Equal Operator // using intern() directly acess string literal value
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1 == s3);
		// Equals Method
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
	}

}
