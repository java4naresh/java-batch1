package com.sai.service;

import java.sql.SQLException;
import java.util.List;

import com.sai.dto.EmployeeDto;

public interface EmployeeService {

	public List<EmployeeDto> getEmployees() throws SQLException;
	
}
