package corejavaprograms;

import java.util.ArrayList;

public class ArrayListExe {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("S");
		al.add(1);
		al.add(null);
		System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.add("Sai");
		al2.add(2);
		al2.add(null);
		al2.add("R");
		System.out.println(al2);
		al.add(1, "Ram");
		System.out.println(al);
		al.addAll(al2);
		System.out.println(al);
		System.out.println(al.contains(1));
		System.out.println(al.containsAll(al2));
		System.out.println(al2.contains(0));
		System.out.println(al.get(4));
		System.out.println(al.indexOf("R"));
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf("Sai"));
		al.remove(5);
		System.out.println(al);
		al.removeAll(al2);
		System.out.println(al);
		al.set(1, "Q");
		System.out.println(al);
		System.out.println(al.size());
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());               
	}

}
