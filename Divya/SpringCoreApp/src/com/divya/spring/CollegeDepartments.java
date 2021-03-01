package com.divya.spring;

public class CollegeDepartments 
{
	private String deptName;
	private int deptNo;
	private String hodName;
	
	private CollegeFaculty faculty; //Injecting faculty class object
	
	public CollegeDepartments()
	{
		super();
	}
	public CollegeDepartments(String deptName, int deptNo, String hodName) {
		super();
		this.deptName = deptName;
		this.deptNo = deptNo;
		this.hodName = hodName;
	}
	public final String getDeptName() {
		return deptName;
	}
	public final void setDeptName(String deptName)
	{
		System.out.println("Set Department Name");
		this.deptName = deptName;
	}
	public final int getDeptNo() {
		return deptNo;
	}
	public final void setDeptNo(int deptNo) {
		System.out.println("Set Dept number");
		this.deptNo = deptNo;
	}
	public final String getHodName() {
		return hodName;
	}
	public final void setHodName(String hodName) {
		System.out.println("Set HOD Name");
		this.hodName = hodName;
	}
	public final CollegeFaculty getFaculty() {
		return faculty;
	}
	public final void setFaculty(CollegeFaculty faculty) {
		this.faculty = faculty;
	}
	@Override
	public String toString() {
		return "CollegeDepartments [deptName=" + deptName + ", deptNo=" + deptNo + ", hodName=" + hodName + ", faculty="
				+ faculty + "]";
	}
	

}
