package com.divya.spring;

public class CollegeFaculty
{
	private int facultyId;
	private String name;
	private String facultyDept;
	private String phNo;
	private int sal;
	
	private CollegeStudent student; //Injecting Student class object in the faculty...
	
	public final String getFacultyDept() {
		return facultyDept;
	}

	public final void setFacultyDept(String facultyDept) {
		this.facultyDept = facultyDept;
	}

	public final CollegeStudent getStudent() {
		return student;
	}

	public final void setStudent(CollegeStudent student) {
		this.student = student;
	}

	public CollegeFaculty() 
	{
		super();
	}
	
	public CollegeFaculty(int facultyId, String name, String facultyDept, String phNo, int sal) {
		super();
		this.facultyId = facultyId;
		this.name = name;
		this.facultyDept = facultyDept;
		this.phNo = phNo;
		this.sal = sal;
	}

	public final int getFacultyId() {
		return facultyId;
	}
	public final void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getPhNo() {
		return phNo;
	}
	public final void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public final int getSal() {
		return sal;
	}
	public final void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "CollegeFaculty [facultyId=" + facultyId + ", name=" + name + ", facultyDept=" + facultyDept + ", phNo="
				+ phNo + ", sal=" + sal + ", student=" + student + "]";
	}
	
	
	

}
