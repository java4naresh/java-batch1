package com.sai.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sai.dao.EmployeeInterface;
import com.sai.dto.EmployeeDto;

@Component
public class EmployeeImpl implements EmployeeInterface {
      
	@Autowired
	private Connection con;
	
	public List<EmployeeDto> getEmployees() throws SQLException {
	 PreparedStatement pst=con.prepareStatement("select empName,empSalary,empId,designation from employee");
	    ResultSet rs=pst.executeQuery();
	    List<EmployeeDto> list=new ArrayList<EmployeeDto>();
	    while(rs.next()) {
	    	EmployeeDto emp=new EmployeeDto(rs.getString("empName"),rs.getInt("empSalary"), rs.getInt("empId"), rs.getString("designation"));
	    	list.add(emp);
	    	
	    }
		return list;
	}

}
