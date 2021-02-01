package com.Liveexmple.Java;


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

	public class SortedMapExmpl1 {

		public static void main(String[] args) {
			Map<String, String> flowers = new HashMap<>();
			Map<String, String> flowers2 = new LinkedHashMap<>();
			flowers.put("Rose", "RED");
			flowers.put("Jasmine", "White");
			flowers.put("Lotus", "Pink");
			flowers.put("Hibiscus", "Red");
			Set<Entry<String,String>> entries = flowers.entrySet();
			Iterator<Entry<String, String>> itr = entries.iterator();
			while(itr.hasNext()) {
				Entry<String, String> entry = itr.next();
				System.out.print(entry.getKey());
				System.out.print("=");
				System.out.print(entry.getValue());
				System.out.println();
			}
			
			System.out.println(entries);
			List<Entry<String,String>> entryList = new ArrayList<>(entries);
			
			/*Collections.sort(entryList, new Comparator<Entry<String,String>>() {

				@Override
				public int compare(Entry<String, String> o1, Entry<String, String> o2) {
					return o1.getValue().compareTo(o2.getValue());
				}
				
			});*/
			Collections.sort(entryList, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
			flowers.entrySet().stream().sorted(Entry.comparingByValue()).collect(
					Collectors.toMap(Entry::getKey, Entry::getValue, (oldValue, newValue) -> newValue, LinkedHashMap::new));
			System.out.println(entryList);
		}

	}



