package corejavaprograms;

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

public class SortedMapEx1
{
	public static void main(String[] args)
	{
		Map<String, String> car = new HashMap<>();
		Map<String, String> car1 = new LinkedHashMap<>();
		car.put("Buggati", "Blue");
		car.put("Tesla", "Red");
		car.put("Ferrari", "Yellow");
		car.put("Lamborghini", "Black");
		Set<Entry<String,String>> entries = car.entrySet();
		Iterator<Entry<String, String>> itr = entries.iterator();
		while(itr.hasNext())
		{
			Entry<String, String> entry = itr.next();
			System.out.print(entry.getKey());
			System.out.print("=");
			System.out.print(entry.getValue());
			System.out.println();
		}
		
		System.out.println(entries);
		List<Entry<String,String>> entryList = new ArrayList<>(entries);
		
       /* Collections.sort(entryList, new Comparator<Entry<String,String>>()
		  {

			@Override
			public int compare(Entry<String, String> obj1, Entry<String, String> obj2)
			 {
				return obj1.getValue().compareTo(obj2.getValue());
			}
			
		});*/
		Collections.sort(entryList, (obj1, obj2) -> obj1.getValue().compareTo(obj2.getValue()));
		car1.entrySet().stream().sorted(Entry.comparingByValue()).collect(
				Collectors.toMap(Entry::getKey, Entry::getValue, (oldValue, newValue) -> newValue, LinkedHashMap::new));
		System.out.println(entryList);
	}


}
