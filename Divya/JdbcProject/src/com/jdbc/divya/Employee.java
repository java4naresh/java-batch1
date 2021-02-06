package com.jdbc.divya;

import java.io.Serializable;

public class Employee implements Serializable
{
	private int empId;
	private String empName;
	private String designation;
	private double sal;
	public Employee()
	{
		
	}
	public Employee(int empId, String empName, String designation, double sal)
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.sal = sal;
	}
	public final int getEmpId()
	{
		return empId;
	}
	public final void setEmpId(int empId)
	{
		this.empId = empId;
	}
	public final String getEmpName() 
	{
		return empName;
	}
	public final void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public final String getDesignation()
	{
		return designation;
	}
	public final void setDesignation(String designation) 
	{
		this.designation = designation;
	}
	public final double getSal() 
	{
		return sal;
	}
	public final void setSal(double sal)
	{
		this.sal = sal;
	}
	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", sal=" + sal
				+ "]";
	}
	

}
