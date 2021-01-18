package corejavaprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SetExample 
{
	public static void main(String[] args)
	{
		BikeModels b1=new BikeModels(8696,"Pulsar", 140, 40.0, "Blue", 80000);
		BikeModels b2=new BikeModels(4695,"NS200", 150, 25.0,"White", 140000);
		BikeModels b3=new BikeModels(486, "Enfield", 160, 20.0,"Silver", 250000);
		
		//HASHSET - Unknown Order
		HashSet hs=new HashSet();
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		System.out.println(hs);
		System.out.println(16+(16*.75));
		
		//LINKEDHASHSET - Insertion Order
		LinkedHashSet<BikeModels> ths=new LinkedHashSet<>();
		ths.add(b1);
		ths.add(b2);
		ths.add(b3);
		System.out.println(ths);
		
		//TREESET - Sorting Order
		TreeSet<BikeModels> ts=new TreeSet<>();
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		System.out.println(ts);
		
		NavigableSet<BikeModels> ns=new TreeSet<>();
		ns.add(b1);
		ns.add(b2);
		ns.add(b3);
		System.out.println(ns);
		BikeModels b4=new BikeModels(846, "NS200", 140, 30.0, "Orange", 200000);
		System.out.println(ns.lower(b4));
		System.out.println(ns.higher(b4));
		System.out.println(ns.ceiling(b4)); //Higher-If the values are same ,then it gives the same value or else it gives higher value.
		System.out.println(ns.floor(b4)); //Lower
		
	}

}
