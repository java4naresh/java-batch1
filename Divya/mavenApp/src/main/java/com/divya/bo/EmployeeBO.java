package com.divya.bo;

public class EmployeeBO
{
	private int empId;
	private String empName;
	private String designation;
	private int sal;
	
	
	public EmployeeBO(int empId, String empName, String designation, int sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.sal = sal;
	}
	public EmployeeBO() 
	{
		
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeBO [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", sal=" + sal
				+ "]";
	}
	
	

}
