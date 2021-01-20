package com.naresh.javabatch1;

import java.util.Comparator;

public class CompratorImpl implements Comparator<Student> {

	// sorting based on student id
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getStudentId() - o2.getStudentId();
	}

}
