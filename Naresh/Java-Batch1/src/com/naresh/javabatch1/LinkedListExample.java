package com.naresh.javabatch1;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class LinkedListExample {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(51);
		list.add(53);
		list.add(55);
		list.add(57);
		System.out.println(list);
		list.add(2, 52);
		//list.set(2, 52);
		System.out.println(list);
		Vector<Integer> v = new Vector<>();
		v.add(10);
		Stack<Integer> s = new Stack<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		System.out.println(s);
		System.out.println(s.peek());
		s.add(6);
		s.add(3, 44);
		s.push(7);
		System.out.println(s);
		s.set(3, 55);
		System.out.println(s);
		
	}

}
