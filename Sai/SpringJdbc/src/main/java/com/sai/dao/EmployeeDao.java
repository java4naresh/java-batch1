package com.sai.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {
	
	
	@Autowired
	private JdbcTemplate template;
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void AllEmloyees() {
	System.out.println(template.queryForObject("select empSalary from employee where empId=1001", String.class));
	}

	public void ListOfEmployees() {
		System.out.println(template.queryForList("select empName from employee",String.class));
	}
	
	public void insert(String empName,int empSalary,int empId,String designation) {
	 String query="insert into employee values("+"'"+empName+"',"+empSalary+","+empId+",'"+designation+"')";
	 System.out.println(query);
	 System.out.println(template.update(query));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
