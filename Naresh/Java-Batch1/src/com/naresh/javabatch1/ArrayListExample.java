package com.naresh.javabatch1;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(30);
		System.out.println(al.size());
		al.add(1);
		al.add(1);
		al.add("Naresh");
		al.add("Naresh");
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(3));
		al.add(2, 6);
		System.out.println(al.size());
		System.out.println(al);
		al.remove(2);
		System.out.println(al.size());
		System.out.println(al);
	/*	LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(1);
		ll.add("Naresh");
		ll.add("Naresh");
		System.out.println(ll.size());
		System.out.println(ll);
		System.out.println(ll.get(0));
		System.out.println(ll.get(3));
		System.out.println(ll.get(4));*/
	}

}
