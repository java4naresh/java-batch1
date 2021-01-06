package com.Liveexmple.Java;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList();
		a1.add("Triveni");
		a1.add("Durga");
		a1.add("sai");
		a1.add(1, "ABC");
		a1.add(2, "CDE");
		a1.add(3, "FGH");
		// a1.add(0, "Mouni");
		System.out.println(" 1 " + a1.clone());
		System.out.println(" 2 " + a1.contains(0));
		System.out.println(" 3 " + a1.equals(2));
		a1.ensureCapacity(1);
		System.out.println(" 4 " + a1.hashCode());
		System.out.println(" 5 " + a1.indexOf(2));
		System.out.println(" 6 " + a1.isEmpty());
		System.out.println(" 7 " + a1.lastIndexOf(2));
		// a1.retainAll(2);

		// using get() to print array values
		System.out.println(a1.size());
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		System.out.println(a1.get(2));
		// using for each loop to print same array values
		for (String names : a1) {
			System.out.println(names);

		}

	}

}
