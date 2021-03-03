package com.divya.spring;

public class Employee
{
	private String empName;
	private int empId;
	private String designation;

	public Employee() 
	{
		super();
		System.out.println("SCOPES");
	}

	public Employee(String empName, int empId, String designation) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.designation = designation;
	}

	public final String getEmpName() {
		return empName;
	}

	public final void setEmpName(String empName) {
		this.empName = empName;
	}

	public final int getEmpId() {
		return empId;
	}

	public final void setEmpId(int empId) {
		this.empId = empId;
	}

	public final String getDesignation() {
		return designation;
	}

	public final void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", designation=" + designation + "]";
	}
	

}
