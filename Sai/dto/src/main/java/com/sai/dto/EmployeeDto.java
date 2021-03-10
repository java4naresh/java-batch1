package com.sai.dto;

public class EmployeeDto {
	private String empName;
	private int empSalary;
	private int empId;
	private String designation;
	public EmployeeDto(String empName, int empSalary, int empId, String designation) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empId = empId;
		this.designation = designation;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "EmployeeDto [empName=" + empName + ", empSalary=" + empSalary + ", empId=" + empId + ", designation="
				+ designation + "]";
	}
	
	

}
