package corejavaprograms;

import java.util.ArrayList;

public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("S");
		System.out.println(al);
		al.add("S");
		System.out.println(al);
		al.add(10);
		System.out.println(al);
		al.add(null);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.add(1, "A");
		System.out.println(al);
		ArrayList a2=new ArrayList();
		a2.add("sai");
		a2.add("p");
		a2.add(2);
		System.out.println(a2);
		al.addAll(a2);
		System.out.println(al);
		System.out.println(a2.contains("sai"));
		System.out.println(a2);
		a2.add(2, "R");
		System.out.println(a2);
		System.out.println(al.containsAll(a2));
		System.out.println(al);
		System.out.println(al.size());
        a2.clear();
        System.out.println(a2);
        System.out.println(a2.isEmpty());
        System.out.println(al.isEmpty());
        System.out.println(al.get(0));
        System.out.println(al.indexOf(null));
        System.out.println(al.lastIndexOf("sai"));
        System.out.println(al);
        System.out.println(al.retainAll(a2));
	}

}
