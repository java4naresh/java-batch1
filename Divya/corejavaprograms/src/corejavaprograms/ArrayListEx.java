package corejavaprograms;

import java.util.ArrayList;

public class ArrayListEx
{

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(12);
		a1.add(20);
		a1.add("Divya");
		a1.add(8);
		a1.add("Triveni");
		a1.add('H');
		System.out.println(a1.size()); //Displays size
		System.out.println(a1); //Displays all the values
		System.out.println(a1.get(2)); //Displays the particular index
		a1.add(3,"Reddy");    //Displays the value in the index given
		System.out.println(a1);
		a1.set(1, "Muskula"); //Displays the new value in the index given and new value is only shown
		System.out.println(a1);
		a1.remove(5);
		System.out.println(a1); //Removes the value
		System.out.println(a1.contains(8)); // True or False(the value is present or not)
		a1.clear(); // All elements will be cleared
		System.out.println(a1.isEmpty()); //True or Flase(If it is cleared ,then true)
		System.out.println(a1.size());
		
	}

}
