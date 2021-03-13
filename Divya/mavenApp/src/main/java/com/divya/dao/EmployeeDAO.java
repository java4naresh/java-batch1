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
		System.out.println(template.queryForObject("select sal from employee where empId=39",Integer.class));
	}

}
