package com.Liveexmple.Java;

import java.util.ArrayList;
import java.util.List;

public class Empmain {

	public static void main(String[] args) {
		Employeedetails a1 = new Employeedetails(1234, "Tiru", 26000, "Java developer", "HO");
		Employeedetails a2 = new Employeedetails(1234, "Bhavani", 26000, "SQL developer", "Vizag");
		List<Employeedetails> ed = new ArrayList<>();
		ed.add(a1);
		ed.add(a2);
		System.out.println(ed);
		ed.add(new Employeedetails(2050, "Divya", 30000, ".NET Developer", "Chennai"));
		System.out.println(ed);
		ed.get(2).setlocation("Mumbai");
		System.out.println(ed);

	}

}
