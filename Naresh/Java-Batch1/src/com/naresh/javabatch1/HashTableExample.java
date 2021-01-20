package com.naresh.javabatch1;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		Map<String, String> m = new Hashtable<>();
		m.put("Mango", "Sweet");
		m.put("Chilli", "Spicy");
		m.put("Tomarundos", "c");
		//m.put(null, "None");
		m.put("Banana", "Sweet");
		m.put("Mango", "Sour");
		//m.put(null, "Sweet");
		System.out.println(m);
	}

}
