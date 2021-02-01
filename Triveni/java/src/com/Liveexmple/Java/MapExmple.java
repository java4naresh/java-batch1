package com.Liveexmple.Java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExmple {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();/*
													 * HashMap is the implementation of Map, but it doesn't maintain any
													 * order. Order of Iteration-- No guarantee order Implements
													 * (Interface)-- Map Map Null key/values-- Only one null key &
													 * multiple values Implementation-- Buckets Synchronized--
													 * Non-synchronized Performance-- Fast Extends-- AbstractMap class
													 * Memory-- Low Memory Thread-safety-- Non-thread-safe
													 */
		Map<String, String> m2 = new HashMap<>();
		m.put(1, "Object");
		m.put(2, "Class");
		m.put(3, "Methods");
		m.put(4, "Superclass");
		m.put(5, "SubClass");
		m.put(6, "Interface");
		m.put(7, "Abtract");
		System.out.println(m);
		System.out.println(m.containsKey(1));
		System.out.println(m.containsValue("Constructor"));
		System.out.println(m.equals(m2));
		System.out.println(m.get(5));
		System.out.println(m.getOrDefault(7, "Interface"));
		System.out.println(m.hashCode());
		System.out.println(m2.isEmpty());
		System.out.println(m.putIfAbsent(1, "Class"));
		System.out.println(m.replace(7, "Collections"));
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.toString());
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());

		Map<Integer, String> m1 = new LinkedHashMap<>();// LinkedHashMap is the implementation of Map. It inherits
														// HashMap class. It maintains insertion order.
		/*
		 * Order of Iteration-- Insertion order Implements (Interface)-- Map Null
		 * key/values-- Only one null key & multiple values Implementation--
		 * Double-linked buckets Synchronized-- non-synchronized Performance-- Almost
		 * Similar to HashMap Extends-- HashMap class Memory-- More memory as compared
		 * to HashMap. Thread-safety-- Non-thread-safe
		 */

		m1.put(1, "Variables");
		m1.put(2, "StaticVariables");
		m1.put(3, "NonStaticVariables");
		m1.put(4, "Methods");
		m1.put(5, "StaticMethods");
		m1.put(6, "NonStatic Methods");
		System.out.println(m1);

		TreeMap<Integer, String> m3 = new TreeMap<>();// TreeMap is the implementation of Map and SortedMap. It
														// maintains ascending order.
		// It implements the NavigableMap interface and extends AbstractMap class.

		m3.put(1, "Variables");
		m3.put(2, "StaticVariables");
		m3.put(3, "NonStaticVariables");
		m3.put(4, "Methods");
		m3.put(5, "StaticMethods");
		m3.put(6, "NonStatic Methods");
		System.out.println(m3);
		System.out.println(m3.get(4));
		System.out.println(m3.containsKey(4));

		// Definition Java HashMap is a hashtable based implementation of Map interface.
		// Java TreeMap is a Tree structure-based implementation of Map interface.
		/*
		 * 1.Interface Implements-- HashMap implements Map, Cloneable, and Serializable
		 * interface--- TreeMap implements NavigableMap, Cloneable, and Serializable
		 * interface.
		 * 
		 * 2.Null Keys/ Values --- HashMap allows a single null key and multiple null
		 * values. TreeMap does not allow null keys but can have multiple null values.
		 * 
		 * 3.Homogeneous/ Heterogeneous-- HashMap allows heterogeneous elements because
		 * it does not perform sorting on keys. TreeMap allows homogeneous values as a
		 * key because of sorting.
		 * 
		 * 4.Performance-- HashMap is faster than TreeMap because it provides
		 * constant-time performance that is O(1) for the basic operations like get()
		 * and put(). TreeMap is slow in comparison to HashMap because it provides the
		 * performance of O(log(n)) for most operations like add(), remove() and
		 * contains().
		 * 
		 * 5.Data Structure-- The HashMap class uses the hash table. TreeMap internally
		 * uses a Red-Black tree, which is a self-balancing Binary Search Tree.
		 * 
		 * 6.Comparison Method-- It uses equals() method of the Object class to compare
		 * keys. The equals() method of Map class overrides it. It uses the compareTo()
		 * method to compare keys.
		 * 
		 * 7.Functionality-- HashMap class contains only basic functions like get(),
		 * put(), KeySet(), etc. TreeMap class is rich in functionality, because it
		 * contains functions like: tailMap(), firstKey(), lastKey(), pollFirstEntry(),
		 * pollLastEntry().
		 * 
		 * 8.Order of elements-- HashMap does not maintain any order. The elements are
		 * sorted in natural order (ascending).
		 * 
		 * 9.Uses--- The HashMap should be used when we do not require key-value pair in
		 * sorted order. The TreeMap should be used when we require key-value pair in
		 * sorted (ascending) order.
		 */

	}

}
