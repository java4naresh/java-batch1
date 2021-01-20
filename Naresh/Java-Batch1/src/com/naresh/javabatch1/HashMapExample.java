package com.naresh.javabatch1;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample extends Object{

	public static void main(String[] args) {
		
		/*int num = 0;
		if(num < 0) {
			System.out.println("Negitive");
		} else {
			if(num == 0) System.out.println("Zero");
			else
			System.out.println("Positive");
		}
		String res = (num < 0) ?s "Negitive" : (num == 0) ? "Zero" : "Positive";
		System.out.println(res);*/
		Map<String, String> m = new HashMap<>();
		m.put("Mango", "Sweet");
		m.put("Chilli", "Spicy");
		m.put("Tomarundos", "c");
		m.put(null, "None");
		m.put("Banana", "Sweet");
		m.put("Mango", "Sour");
		m.put(null, "Sweet");
		System.out.println(m);
		/*Map<Employee, String> m = new HashMap<>();
		Employee e1 = new Employee(1,"Naresh");
		Employee e2 = new Employee(1,"Ramesh");
		Employee e3 = new Employee(1,"Suresh");
		m.put(e1, "Naresh");
		m.put(e2, "Ramesh");
		m.put(e3, "Suresh");
		System.out.println(m.get(e1));
		System.out.println(m);*/
		/*Map<Integer,String> cricket = new HashMap<>();
		cricket.put(2, "Rohit");
		cricket.put(3, "Pujara");
		cricket.put(4, "Rahane");
		cricket.put(5, "Pant");
		cricket.put(6, "Agarval");
		cricket.put(7, "Sundar");
		cricket.put(8, "Sardul");
		cricket.put(9, "Saini");
		cricket.put(10, "Bumra");
		cricket.put(11, "Siraj");
		cricket.put(4, "Kohli");
		cricket.put(1, "Gill");
		System.out.println(cricket);*/
		// hash collision
		/*Map<Student,String> students = new HashMap<>();
		Student s1 = new Student(1, "Naresh");
		Student s2 = new Student(1, "Suresh");
		Student s3 = new Student(1, "Ramesh");
		students.put(s1, "Naresh");
		students.put(s2, "Suresh");
		students.put(s3, "Ramesh");
		System.out.println(students);*/
	}

}
