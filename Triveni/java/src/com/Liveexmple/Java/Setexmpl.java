package com.Liveexmple.Java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Setexmpl {

	public static void main(String[] args) {
		Set<Laptop> set=new TreeSet<>();
		Laptop l1 = new Laptop(20, "Dell");
		Laptop l2 = new Laptop(17, "HP");
		Laptop l3 = new Laptop(20, "Apple");
		set.add(l1);
		set.add(l2);
		set.add(l3);
		System.out.println(set);
		List<Laptop> list=new ArrayList<>(set);
		Collections.sort(list,new Comparatorexampl1());
		Collections.sort(list,new Comparatorexmpl2());
		System.out.println(list);
		
		
		

	}

}
