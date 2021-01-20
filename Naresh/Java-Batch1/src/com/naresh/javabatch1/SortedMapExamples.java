package com.naresh.javabatch1.pack2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortedMapExamples {

	public static void main(String[] args) {
		Map<String, String> names = new HashMap<>();
		Map<String, String> names2 = new LinkedHashMap<>();
		names.put("kambala", "naresh");
		names.put("ponuganti", "triveni");
		names.put("thalla", "sai");
		names.put("musukula", "divya");
		Set<String> keys = names.keySet();
        System.out.println("======unsorted keys======");
        System.out.println(keys);
        System.out.println("==========================");
        Set<String> sortedKeys = new TreeSet<>(keys);
        System.out.println("======Sorted keys======");
        System.out.println(sortedKeys);
        System.out.println("==========================");
        Iterator<String> sortedItr = sortedKeys.iterator();
        while(sortedItr.hasNext()) {
        	String key = sortedItr.next();
        	names2.put(key, names.get(key));
        }
        System.out.println(names);
        System.out.println(names2);
	}

}
