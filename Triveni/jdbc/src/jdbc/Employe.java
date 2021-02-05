package jdbc;

import java.io.Serializable;

public class Employe implements Serializable{
	int empId;
	String empName;
	double empSalary;
	String empDesignation;
	
	public Employe() {
		
	}
	
	
	
	public Employe(int empId, String empName, double empSalary, String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
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
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDesignation="
				+ empDesignation + "]";
	}





}
