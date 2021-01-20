package com.naresh.javabatch1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Integer,String> cricket = new TreeMap<>();
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
		Map<Student,String> students = new TreeMap<>();
		Student s1 = new Student(1, "Naresh");
		Student s2 = new Student(2, "Suresh");
		Student s3 = new Student(3, "Ramesh");
		students.put(s1, "Naresh");
		students.put(s2, "Suresh");
		students.put(s3, "Ramesh");
		System.out.println(students);
		Set<Student> set = new TreeSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		System.out.println(set);
	    List<Student> list = new ArrayList<>(set);
		/*Collections.sort(list, new CompratorImpl());
		Collections.sort(list, new ComparatorImpl2());*/
	    Collections.sort(list);
	    Collections.sort(list, (std1, std2) -> std1.getStudentId() - std2.getStudentId());
	    Collections.sort(list, (std1, std2) -> std1.getName().compareTo(std2.getName()));
		System.out.println(list);
	}

}
