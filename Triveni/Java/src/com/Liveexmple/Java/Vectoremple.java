package com.Liveexmple.Java;

import java.util.Vector;

public class Vectoremple {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>();
		vector.add(11);
		vector.add(22);
		vector.add(33);
		vector.add(44);
		vector.add(55);
		vector.add(66);
		vector.add(77);
		vector.add(88);
		vector.add(99);
		vector.add(100);
		System.out.println(vector.capacity());
		vector.add(110);
		System.out.println(vector.capacity());
		System.out.println(vector.clone());
		System.out.println(vector.contains(120));
		System.out.println(vector.equals(vector));
		System.out.println(vector.indexOf(11));
		System.out.println(vector.isEmpty());
		//System.out.println(vector.removeIf(vector));
		System.out.println(vector.retainAll(vector));
		System.out.println(vector.stream());
		System.out.println(vector.toArray());
		//System.out.println(vector.replaceAll(vector));
		System.out.println(vector.retainAll(vector));
		System.out.println(vector.size());
		System.out.println(vector.parallelStream());
		
		

	}

}
