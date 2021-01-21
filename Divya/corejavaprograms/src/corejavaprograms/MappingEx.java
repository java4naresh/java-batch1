package corejavaprograms;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class MappingEx
{
	public static void main(String[] args)
	{
	       Map<String, String> car = new HashMap<>();
	       Map<String, String> car1 = new HashMap<>();
	       car.put("Buggati", "Blue");
	       car.put("Tesla", "Red");
	       car.put("Ferrari", "Yellow");
	       car.put("Lamborghini", "Black");
	       System.out.println(car.get("Buggati"));
	       System.out.println(car.get("Tesla"));
	       System.out.println(car.get("Ferrari"));
	       System.out.println(car.get("Lamborghini"));
	       System.out.println(car);
	       Set<String> keys = car.keySet();
	       System.out.println("************UNSORTED KEYS*********");
	       System.out.println(keys);
	       System.out.println("************************");
	       Iterator<String> keysItr = keys.iterator();
	       while(keysItr.hasNext())
	       {
	    	   System.out.println(car.get(keysItr.next()));
	       }
	       System.out.println("************SORTED KEYS************");
	       Set<String> srtedKeys = new TreeSet<>(keys);
	       System.out.println(srtedKeys);
	       Iterator<String> sortedkeysItr = srtedKeys.iterator();
	       while(sortedkeysItr.hasNext())
	       {
	    	   car1.put(sortedkeysItr.next(), car.get(sortedkeysItr.next()));
	       }
	       System.out.println(car1);
	       System.out.println("************");
	       Set<Entry<String, String>> entries = car.entrySet();
	       System.out.println(entries);
	       Iterator<Entry<String, String>> entryItr = entries.iterator();
	       while(entryItr.hasNext())
	       {
	    	   System.out.println(entryItr.next());
	       }
	       System.out.println(car.values());
		}

}
