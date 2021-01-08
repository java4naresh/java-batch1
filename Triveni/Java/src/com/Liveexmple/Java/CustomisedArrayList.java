package com.Liveexmple.Java;

import java.util.ArrayList;
import java.util.List;

public class CustomisedArrayList {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Triveni");
		Employee e2 = new Employee(102, "Durga");
		List<String> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		System.out.println(employeeList);
		employeeList.add(new Employee(103, "Sai"));
		System.out.println(employeeList);
		employeeList.get(2).setName("Mouni");
		System.out.println(employeeList.remove(new Employee(105, "Akhil")));
		System.out.println(employeeList);

	}

}
