package com.sai.dao;

import java.sql.SQLException;
import java.util.List;

import com.sai.dto.EmployeeDto;

public interface EmployeeInterface {

       public List<EmployeeDto> getEmployees() throws SQLException;
	
	
}
