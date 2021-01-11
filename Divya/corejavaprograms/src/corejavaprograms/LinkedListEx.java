package corejavaprograms;

import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args)
	{
		//Linked List
		List<String> list=new LinkedList<>();
		list.add("Muskula");
		list.add("Reddy");
		list.add("Sumathi");
		System.out.println(list);
		list.add(1,"Divya");
		System.out.println(list);
		
		//Vector
		Vector<Integer> v=new Vector<>();
		v.add(8);
		v.add(4);
		v.add(6);
		System.out.println(v);
		
		//Stack
		Stack<Integer> s= new Stack<>(); //LIFO
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		System.out.println(s);
		System.out.println(s.pop()); //POP method removes the last element
		System.out.println(s);
		s.add(5);
		System.out.println(s.peek());
		System.out.println(s);
		s.push(6); //PUSH method same like add...it adds the element
		s.add(0, 0);
		s.set(4, 48);
		System.out.println(s);
		

	}

}
