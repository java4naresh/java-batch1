package com.Liveexmple.Java;

import java.util.HashMap;
import java.util.Map;

public class HashCollisionexmpl {

	public static void main(String[] args) {
		Map<Laptop, String> laptop = new HashMap<>();
		Laptop l1 = new Laptop(20, "Dell");
		Laptop l2 = new Laptop(17, "HP");
		Laptop l3 = new Laptop(20, "Apple");
		laptop.put(l1, "Dell");
		laptop.put(l2, "Apple");
		laptop.put(l3, "HP");
		System.out.println(laptop);

	}

}
