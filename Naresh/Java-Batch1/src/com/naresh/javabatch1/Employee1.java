package com.naresh.javabatch1;

public class Employee1 implements Cloneable{
	
	private int empId;
	
	private String name;
	
	public Employee1() {
		
	}
	
	public Employee1(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee1 e = (Employee1) obj;
		if(this.empId == e.empId && this.name.equals(e.getName()))
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.empId;
	}

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", name=" + name + "]";
	}
	
	@Override
	public Employee1 clone() {
		return this;
	}
	
	@Override
	public void finalize() {
		System.out.println("finalize");
	}
	

}
