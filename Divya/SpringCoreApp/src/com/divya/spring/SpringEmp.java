package com.divya.spring;

public class SpringEmp
{
	private int empId;
	private String empName;
	private String empDesignation;
	private int empSal;
	private SpringAddress add1;
	
	public SpringEmp()
	{
		
	}
	public SpringEmp(int empId, String empName, String empDesignation, int empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSal = empSal;
	}
	public final int getEmpId() {
		return empId;
	}
	public final void setEmpId(int empId) {
		this.empId = empId;
	}
	public final String getEmpName() {
		return empName;
	}
	public final void setEmpName(String empName) {
		this.empName = empName;
	}
	public final String getEmpDesignation() {
		return empDesignation;
	}
	public final void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public final int getEmpSal() {
		return empSal;
	}
	public final void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	public final SpringAddress getAdd1() {
		return add1;
	}
	public final void setAdd1(SpringAddress add1) {
		this.add1 = add1;
	}
	@Override
	public String toString() {
		return "SpringEmp [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation + ", empSal="
				+ empSal + ", add1=" + add1 + "]";
	}
	

}
