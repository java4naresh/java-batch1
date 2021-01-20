package com.naresh.javabatch1.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SortedMapExample2 {

	public static void main(String[] args) {
		Map<String, String> names = new HashMap<>();
		Map<String, String> names2 = new LinkedHashMap<>();
		names.put("kambala", "naresh");
		names.put("ponuganti", "triveni");
		names.put("thalla", "sai");
		names.put("musukula", "divya");
		Set<Entry<String,String>> entries = names.entrySet();
		Iterator<Entry<String, String>> itr = entries.iterator();
		while(itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.print(entry.getKey());
			System.out.print("=");
			System.out.print(entry.getValue());
			System.out.println();
		}
		
		//System.out.println(entries);
		List<Entry<String,String>> entryList = new ArrayList<>(entries);
		
		/*Collections.sort(entryList, new Comparator<Entry<String,String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});*/
		Collections.sort(entryList, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		names.entrySet().stream().sorted(Entry.comparingByValue()).collect(
				Collectors.toMap(Entry::getKey, Entry::getValue, (oldValue, newValue) -> newValue, LinkedHashMap::new));
		System.out.println(entryList);
	}

}
