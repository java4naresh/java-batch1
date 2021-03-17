package com.divya.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class EmployeeDAO
{
	@Autowired
	private JdbcTemplate template;
	
	//private DataSource dataSource;
	
	
	public final JdbcTemplate getTemplate() {
		return template;
	}

	public final void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public void printAllEmployees()
	{
		//System.out.println(template.queryForObject("select empName from employee where empId=39",String.class));
		//System.out.println(template.queryForObject("select sal from employee where empId=39",Integer.class));
		System.out.println(template.queryForList("select empName from employee",String.class)); //Will print all the employeeNames
		System.out.println(template.queryForList("select empId from employee",Integer.class));
	}
	public void printSalary(int empId)
	{
		System.out.println(template.queryForInt("select sal from employee where empId="+empId));
	}
	public void printName(int empId)
	{
		System.out.println(template.queryForObject("select empName from employee where empId="+empId,String.class));
	}
	public void insert(int empId,String empName,String designation,int sal)
	{
		String query="insert into employee values("+empId+",'"+empName+"',"+"'"+designation+"',"+sal+")";
		System.out.println(template.update(query));
	}
	public void update(int empId,String empName)
	{
		String query="update employee set empName="+"'"+empName+"' where empId="+empId;
		System.out.println(template.update(query));
	}
	public void delete(int empId)
	{
		String query="delete from employee where empId="+empId;
		System.out.println(template.update(query));
	}
}