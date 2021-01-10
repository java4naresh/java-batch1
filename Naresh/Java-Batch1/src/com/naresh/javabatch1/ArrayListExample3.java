package com.naresh.javabatch1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {

	public static void main(String[] args) {
		Employee e2 = new Employee(102,"Ramesh");
		Employee e1 = new Employee(101, "Naresh");
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e2);
		employeeList.add(e1);
		System.out.println(employeeList);
		employeeList.add(new Employee(103, "Suresh"));
		System.out.println(employeeList);
		//employeeList.get(2).setName("Rajesh");
		//System.out.println(employeeList);
		employeeList.sort((emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));
		//System.out.println(employeeList.remove(new Employee(103, "Suresh")));
		System.out.println(employeeList);
		
	}

}
