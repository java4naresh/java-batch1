package com.divya.dao;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;

import com.divya.bo.EmployeeBO;

public class EmployeeStoredProcedure extends StoredProcedure
{

	public EmployeeStoredProcedure(JdbcTemplate jdbcTemplate) 
	{
		super(jdbcTemplate,"GetAllEmployees");
		ResultSetExtractor<List<EmployeeBO>> rowMapper=new EmployeeResultSetExtractor();
		declareParameter(new SqlReturnResultSet("RESULT_LIST",rowMapper));
		//declareParameter(new SqlParameter("id",Types.INTEGER));
		compile();
	}
	
	@SuppressWarnings({"unchecked","rawtypes"})
	public Map getEmployees()
	{
		Map out = execute();
		return out;
	}
	
	public Map getSalary()
	{
		Map out = execute(39);
		return out;

	}

}
