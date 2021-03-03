package com.divya.spring;

public class EmpDetails
{
	private Employee employee;

	public EmpDetails()
	{
		super();
		
	}

	public EmpDetails(Employee employee) {
		super();
		this.employee = employee;
	}

	public final Employee getEmployee() {
		return employee;
	}

	public final void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmpDetails [employee=" + employee + "]";
	}
	

}
