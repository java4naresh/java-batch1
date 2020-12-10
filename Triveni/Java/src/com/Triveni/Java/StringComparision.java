package com.Triveni.Java;

public class StringComparision 
{
	public static void main(String[] args) {
		//Contains() method uses to check the string prasent or not in string literal,order is important & case sensitive
	
	String s1="Java Angular";
	System.out.println(s1.contains("Java"));
	System.out.println(s1.contains("Angular"));
	System.out.println(s1.contains("avaj"));
	System.out.println(s1.contains("ava"));
	
	
	//replace(),replaceAll(),replaceFirst(),startsWith(),endsWith(),-----These are the regular expressions
	String s2="Triveni P";
	System.out.println(s2.replace("Triveni","K"));//To change the charactors first position is the old value ,Second position is the new value
	System.out.println(s2.replaceAll("P","Kanna"));//To change the String first position is the old value ,Second position is the new value
	System.out.println(s2.startsWith("T"));//case sensitive
	System.out.println(s2.endsWith("P"));//case sensitive
	}
	

}
