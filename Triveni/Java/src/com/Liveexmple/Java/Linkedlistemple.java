package com.Liveexmple.Java;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlistemple {

	public static void main(String[] args) {
		List<Integer> list= new LinkedList<>();
		List<Integer> list2= new LinkedList<>();
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		System.out.println(list);
		list.add(1, 40);
		System.out.println(list);
		list.add(0, 40);
		System.out.println(list);
		list.remove(0);
		System.out.println(list.contains(100));
		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(44);
		list2.add(55);
		System.out.println(list.equals(list2));
		//list.forEach(null);
		System.out.println(list2.get(2));
		System.out.println(list.indexOf(100));
		System.out.println(list.lastIndexOf(100));
		
		List<String> list3=new LinkedList<>();
		list3.add(0, "Tiru");
		list3.add(1, "Durga");
		list3.add(2, "Sai");
		list3.add(3, "Mouni");
		System.out.println(list3);
		System.out.println("1 "+list3.contains("Durga"));
		System.out.println("2 "+list2.containsAll(list3));
		System.out.println("3 "+list2.equals(list3));
		System.out.println("4 "+list3.indexOf("Sai"));
		System.out.println("5 "+list3.isEmpty());
		System.out.println("6 "+list3.lastIndexOf("Mouni"));
		System.out.println("7 "+list3.remove(0));
		System.out.println("22  "+list3);
		System.out.println("8 "+list3.retainAll(list3));
		System.out.println("9 "+list3.size());
		System.out.println("10 "+list3.get(2));
		System.out.println("11 "+list3.set(1,"Sai"));
		System.out.println("12 "+list3);
		System.out.println("13 "+list3.spliterator());
		System.out.println("14 "+list3.subList(1, 2));
		System.out.println("15  "+list3.toArray());
		//list3.removeIf(null);
		//System.out.println(list3.ensureCapacity(20));
		//System.out.println(list3.replaceAll());
		//Collections.sort("16"+list3); 
		System.out.println("17 "+list3);
		//System.out.println(list3.trimToSize());
	
	
	}

}
