package corejavaprograms;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args)
	{
		BikeModels b1=new BikeModels(8696," Pulsar", 140, 40.0, "Blue", 80000);
		BikeModels b2=new BikeModels(4695,"NS200", 150, 25.0,"White", 140000);
		List<BikeModels> bm=new ArrayList<>();
		bm.add(b1);
		bm.add(b2);
		System.out.println(bm);
		bm.add(new BikeModels(8400, "Enfield", 160, 35.0, "Silver", 250000));
		System.out.println(bm);
		bm.get(2).setBrand("RoyalEnfield");
		System.out.println(bm);
		
	}

}
