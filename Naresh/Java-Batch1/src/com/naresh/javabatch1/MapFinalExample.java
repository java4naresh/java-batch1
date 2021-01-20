package com.naresh.javabatch1.pack2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MapFinalExample {

	public static void main(String[] args) {
       Map<String, String> names = new HashMap<>();
       Map<String, String> names2 = new HashMap<>();
       names.put("kambala", "naresh");
       names.put("ponuganti", "triveni");
       names.put("thalla", "sai");
       names.put("musukula", "divya");
       /*System.out.println(names.get("kambala"));
       System.out.println(names.get("ponuganti"));
       System.out.println(names.get("thalla"));
       System.out.println(names.get("musukula"));*/
       System.out.println(names);
       Set<String> keys = names.keySet();
       System.out.println("====UnSorted keys============");
       System.out.println(keys);
       System.out.println("================");
       Iterator<String> keysItr = keys.iterator();
       while(keysItr.hasNext()) {
    	   System.out.println(names.get(keysItr.next()));
       }
       System.out.println("====Sorted keys============");
       Set<String> srtedKeys = new TreeSet<>(keys);
       System.out.println(srtedKeys);
       Iterator<String> sortedkeysItr = srtedKeys.iterator();
       while(sortedkeysItr.hasNext()) {
    	   names2.put(sortedkeysItr.next(), names.get(sortedkeysItr.next()));
       }
       System.out.println(names2);
       System.out.println("================");
       Set<Entry<String, String>> entries = names.entrySet();
       System.out.println(entries);
       Iterator<Entry<String, String>> entryItr = entries.iterator();
       while(entryItr.hasNext()) {
    	   System.out.println(entryItr.next());
       }
       System.out.println(names.values());
	}

}
