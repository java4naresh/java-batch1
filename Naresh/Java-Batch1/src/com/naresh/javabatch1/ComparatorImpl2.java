package com.naresh.javabatch1;

import java.util.Comparator;

public class ComparatorImpl2 implements Comparator<Student> {

	// sorting based on student name
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
