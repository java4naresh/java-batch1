package com.sai.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sai.dao.EmployeeInterface;
import com.sai.dto.EmployeeDto;
import com.sai.service.EmployeeService;


@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	   @Autowired
	   private EmployeeInterface emp;
	

	public List<EmployeeDto> getEmployees() throws SQLException {	
		return emp.getEmployees();
	}

	
	 
	

}
