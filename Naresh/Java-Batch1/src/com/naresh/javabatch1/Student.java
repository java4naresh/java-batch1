package com.naresh.javabatch1;
//POJO Plain Old Java Object
public class Student implements Comparable<Student> {
	
	private int studentId;
	private String name;
	
	public Student() {
		
	}
	
	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student std = (Student)obj;
		//return this.hashCode() == std.hashCode();
		/*if (this.studentId == std.studentId && this.name.equals(std.getName()))
			return true;
		return false;*/
		return (this.studentId == std.studentId && this.name.equals(std.getName())) ? true : false;
	}

	/*@Override
	public int compareTo(Object o) {
		Student std = (Student)o;
		//return this.studentId - std.getStudentId();
		return this.name.compareTo(std.getName());
	}*/

	@Override
	public int compareTo(Student std) {
		return this.name.compareTo(std.getName());
	}

	
}
