package com.Liveexmple.Java;

public class Employee {

	private int empId;

	private String name;

	// private Employee Employee;

	public Employee() {

	}

	public Employee(int empId, String name) {
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
	public int hashCode() {
		return this.empId;
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		if (this.empId == emp.getEmpId() && this.name.equals(emp.getName())) {
			return true;

		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

}
