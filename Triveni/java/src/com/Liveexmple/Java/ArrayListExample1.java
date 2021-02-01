package com.Liveexmple.Java;

import java.util.ArrayList;

public class ArrayListExample1 {
	private static final int Integer = 0;

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Triveni");
		al.add("Durga");
		al.add("Sai");
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al);

		int[] intarr = new int[2];
		String[] strarr = new String[2];
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) instanceof Integer)
				intarr[0] = (Integer) al.get(i);
			else
				strarr = (String[]) al.get(i);// here class cast Exception to overcome this exception using Generics
		// class cast means to change integer to string this is class cast Exception.
	}
	}

}
