package com.divya.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.divya.bo.EmployeeBO;
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
		//System.out.println(template.queryForList("select empName from employee",String.class)); //Will print all the employeeNames
		//System.out.println(template.queryForList("select empId from employee",Integer.class));
		List<EmployeeBO> emp=template.query("select * from employee",new Object[] {},new EmployeeResultSetExtractor());
		System.out.println(emp);
	}
	
	public void printEmployee(int empId)
	{
		EmployeeBO bo =template.queryForObject("select empId,empName,designation,sal from employee where empId=?",new Object[] {empId}, new EmployeeRowMapper());
		System.out.println(bo);
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
class EmployeeRowMapper implements RowMapper<EmployeeBO>
{

	public EmployeeBO mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		EmployeeBO bo=new EmployeeBO();
		//while(rs.next()){
			bo.setEmpId(rs.getInt(1));
			bo.setEmpName(rs.getString(2));
			bo.setDesignation(rs.getString(3));
			bo.setSal(rs.getInt(4));
			
		//}
		return bo;
	}
	
}
class EmployeeResultSetExtractor implements ResultSetExtractor<List<EmployeeBO>>
{

	public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException
	{
		List<EmployeeBO> list=new ArrayList();
		while(rs.next())
		{
			EmployeeBO bo=new EmployeeBO();
			bo.setEmpId(rs.getInt(1));
			bo.setEmpName(rs.getString(2));
			bo.setDesignation(rs.getString(3));
			bo.setSal(rs.getInt(4));
			list.add(bo);
			
		}
		return list;
	}
	
}
