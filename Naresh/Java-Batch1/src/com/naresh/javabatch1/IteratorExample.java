package com.naresh.javabatch1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Naresh");
        names.add("Suresh");
        names.add("Ramesh");
        Iterator<String> itr = names.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println("==============================");
        ListIterator<String> ltr = names.listIterator();
        while(ltr.hasNext()) {
        	System.out.println(ltr.next());
        }
        System.out.println("==============================");
        while(ltr.hasPrevious()) {
        	System.out.println(ltr.previous());
        }
        System.out.println("==============================");
        Set<String> names2 = new HashSet<String>();
        names2.add("Naresh");
        names2.add("Suresh");
        names2.add("Ramesh");
        Iterator<String> itr2 = names2.iterator();
        while(itr2.hasNext()) {
        	System.out.println(itr2.next());
        }
	}

}
