package corejavaprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortedMapEx
{
	public static void main(String[] args)
	{
		Map<String, String> car = new HashMap<>();
		Map<String, String> car1 = new LinkedHashMap<>();
		car.put("Buggati", "Blue");
		car.put("Tesla", "Red");
		car.put("Ferrari", "Yellow");
		car.put("Lamborghini", "Black");
		Set<String> keys = car.keySet();
        System.out.println("UNSORTED KEYS");
        System.out.println(keys);
        System.out.println("***********************");
        Set<String> sortedKeys = new TreeSet<>(keys);
        System.out.println("SORTED KEYS");
        System.out.println(sortedKeys);
        System.out.println("************************");
        Iterator<String> sortedItr = sortedKeys.iterator();
        while(sortedItr.hasNext())
        {
        	String key = sortedItr.next();
        	car1.put(key, car.get(key));
        }
        System.out.println(car);
        System.out.println(car1);
	}

}
