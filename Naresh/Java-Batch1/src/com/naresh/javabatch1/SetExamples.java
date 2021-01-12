package com.naresh.javabatch1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(5);
		hs.add(2);
		hs.add(0);
		hs.add(1);
		System.out.println(hs);
		System.out.println(16+(16*.75));
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(5);
		lhs.add(2);
		lhs.add(3);
		lhs.add(5);
		System.out.println(lhs);
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Triveni");
		ts.add("Naresh");
		ts.add("Divya");
		ts.add("Sai");
		ts.add("Veerababu");
		System.out.println(ts);
		NavigableSet<String> ns = new TreeSet<>();
		ns.add("Triveni");
		ns.add("Naresh");
		ns.add("Divya");
		ns.add("Sai");
		ns.add("Veerababu");
		//ns.ceiling("Google");
		System.out.println(ns);
		System.out.println(ns.ceiling("Ramesh"));
		System.out.println(ns.floor("Ramesh"));
		System.out.println(ns.lower("Sai"));
		System.out.println(ns.higher("Sai"));
		
	}

}
