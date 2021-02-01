package com.Liveexmple.Java;

import java.util.Stack;

public class Stackemple {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.add(1);//0
		stack.add(2);//1
		stack.add(3);//2
		stack.add(4);//3
		stack.add(5);//4
		stack.add(6);//5
		stack.add(7);//6
		stack.add(8);//7
		stack.add(9);//8
		stack.add(10);//9
		System.out.println("1st Capacity is "+stack.capacity());
		stack.add(11);//10
		System.out.println(stack);
		System.out.println("2nd capacity is "+stack.capacity());
		System.out.println(stack.contains(6));
		System.out.println(stack.hashCode());
		System.out.println(stack.indexOf(5));
		//System.out.println(stack.remove(9));
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.toString());
		System.out.println(stack.elementAt(8));
		System.out.println(stack.elements());
		System.out.println(stack.firstElement());
		System.out.println(stack.get(1));
		System.out.println(stack.toString());
		System.out.println(stack.getClass());
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println("first  "+stack.remove(1));
		System.out.println(stack);
		System.out.println(stack.push(12));
		System.out.println(stack);
	}

}
