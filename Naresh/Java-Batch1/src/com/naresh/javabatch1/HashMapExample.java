package com.naresh.javabatch1;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		/*int num = 0;
		if(num < 0) {
			System.out.println("Negitive");
		} else {
			if(num == 0) System.out.println("Zero");
			else
			System.out.println("Positive");
		}
		String res = (num < 0) ?s "Negitive" : (num == 0) ? "Zero" : "Positive";
		System.out.println(res);*/
		Map<String, String> m = new HashMap<>();
		m.put("Mango", "Sweet");
		m.put("Chilli", "Spicy");
		m.put("Tomarundos", "c");
		m.put(null, "None");
		m.put("Banana", "Sweet");
		m.put("Mango", "Sour");
		m.put(null, "Sweet");
		System.out.println(m);
	}

}
