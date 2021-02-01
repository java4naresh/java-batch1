package com.Liveexmple.Java;

public class TerminaryOperations {
	public static void main(String[] args) {
		
		int num=-1;
		String s=(num<0)?"Negative":"Positive";
		System.out.println(s);
		
		
		int num1=4;
		String s1=(num1<0)?"Negative":(num1==0)?"Zero":"Positive";
		System.out.println(s1);
		
		
		String st="Java";
		String s2=(st=="C")?"Java is best pgm lang":"Not a Java Lang";
		System.out.println(s2);
		
		
	}

}
