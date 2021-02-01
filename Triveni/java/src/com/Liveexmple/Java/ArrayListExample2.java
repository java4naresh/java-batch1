package com.Liveexmple.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList();
		ArrayList<String> a2 = new ArrayList();

		a1.add("Triveni");// 0
		a1.add("Durga");// 1
		a1.add("sai");// 2
		a1.add(1, "ABC");// 3
		a1.add(2, "CDE");// 4
		a1.add(3, "FGH");// 5
		System.out.println(a1);
		a1.set(0, "Mouni");
		System.out.println(a1);
		a1.add("Kanna");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1.get(1));
		System.out.println(" 1 " + a1.clone());
		System.out.println(" 2 " + a1.contains("Sai"));
		System.out.println(" 3 " + a1.equals(2));
		a1.ensureCapacity(1);
		System.out.println(" 4 " + a1.hashCode());
		System.out.println(" 5 " + a1.indexOf(2));
		System.out.println(" 6 " + a1.isEmpty());
		System.out.println(" 7 " + a1.lastIndexOf("Durga"));
		System.out.println(" 8 " + a1.lastIndexOf(2));
		System.out.println(" 9 " + a2.addAll(a1));
		System.out.println(a1.retainAll(a2));
		System.out.println(a1);

	}
}
