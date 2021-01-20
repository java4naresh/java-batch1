package com.naresh.javabatch1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		Map<Integer,String> cricket = new LinkedHashMap<>();
		cricket.put(2, "Rohit");
		//cricket.put(4, "Rahane");
		cricket.put(5, "Pant");
		cricket.put(7, "Sundar");
		cricket.put(8, "Sardul");
		cricket.put(9, "Saini");
		cricket.put(10, "Bumra");
		cricket.put(11, "Siraj");
		cricket.put(4, "Kohli");
		cricket.put(1, "Gill");
		cricket.put(6, "Agarval");
		cricket.put(3, "Pujara");
		System.out.println(cricket);
		Map<Student,String> students = new LinkedHashMap<>();
		Student s1 = new Student(1, "Naresh");
		Student s2 = new Student(1, "Suresh");
		Student s3 = new Student(1, "Ramesh");
		students.put(s1, "Naresh");
		students.put(s2, "Suresh");
		students.put(s3, "Ramesh");
		System.out.println(students);
	}

}
