package corejavaprograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods 
{
	public static void main(String[] args)
	{
		ArrayList<Character> arr=new ArrayList<Character>();
		arr.add('M');
		arr.add('D');
		arr.add('i');
		System.out.println(arr);
		ArrayList<Character> arr1=new ArrayList<Character>();
		arr1.addAll(arr);
		arr1.add('v');
		arr1.add('y');
		arr1.add('a');
		System.out.println(arr1);
		arr1.add(0, 'M');
		System.out.println(arr1);
		System.out.println(arr1.contains('D'));
		System.out.println(arr1.containsAll(arr));
		System.out.println(arr1.equals(arr));
		System.out.println(arr1.indexOf('a'));
		System.out.println(arr1.isEmpty());
		System.out.println(arr1.lastIndexOf('M'));
		System.out.println(arr1.remove(0));
		System.out.println(arr1.retainAll(arr));
		System.out.println(arr1.size());
		System.out.println(arr1.get(1));
		System.out.println(arr1.set(0,'S'));
		arr1.set(0, 'S');
		System.out.println(arr1);
		System.out.println(arr1.spliterator());
		System.out.println(arr1.subList(1, 3));
		System.out.println(arr1.toArray());
		//System.out.println(arr1.ensureCapacity(10));
		//System.out.println(arr1.replaceAll());
		Collections.sort(arr1); // bcz of ascii values
		System.out.println(arr1);
		//System.out.println(arr1.trimToSize());
		ArrayList<Character> arr2= (ArrayList<Character>)arr1.clone();
		System.out.println(arr2);
		arr2.add('v');
		System.out.println(arr2);
		System.out.println(arr1);
		System.out.println(arr);
	}

}
