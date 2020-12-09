package com.naresh.javabatch1;

public class StringExample2 {

	public static void main(String[] args) {
		String name = "Naresh";
		String name2 = "Naresh";
		String name3 = new String("Naresh").intern();
		String name4 = name3.intern();
		System.out.println(name == name2);
		System.out.println(name == name3);
		System.out.println(name == name4);
		char[] chars = {'n','a', 'r','e','s','h'};
		String name5 = new String(chars);
		System.out.println(name5);
		String name6 = new String(chars, 2, 4);
		System.out.println(name6);
		int[] arr = {65, 67, 89, 74, 85, 80, 97};
		String name7 = new String(arr, 0, 7);
		System.out.println(name7);
	}

}
