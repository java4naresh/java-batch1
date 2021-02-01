package com.Liveexmple.Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortedMapExmpl2 {
	public static void main(String[] args)
	{
		Map<String, String> flowers = new HashMap<>();
		Map<String, String> flowers1 = new LinkedHashMap<>();
		flowers.put("Rose", "RED");
		flowers.put("Jasmine", "White");
		flowers.put("Lotus", "Pink");
		flowers.put("Hibiscus", "Red");
		Set<String> keys = flowers.keySet();
        System.out.println("Keys Unsorted Order");
        System.out.println(keys);
        System.out.println("----------------------");
        Set<String> sortedKeys = new TreeSet<>(keys);
        System.out.println("Keys Sorted Order");
        System.out.println(sortedKeys);
        System.out.println("------------------------");
        Iterator<String> sortedItr = sortedKeys.iterator();
        while(sortedItr.hasNext())
        {
        	String key = sortedItr.next();
        	flowers.put(key, flowers.get(key));
        }
        System.out.println(flowers);
        System.out.println(flowers);
	}
}
