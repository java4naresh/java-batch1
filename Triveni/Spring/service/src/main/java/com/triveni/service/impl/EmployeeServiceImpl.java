package com.triveni.service.impl;

import java.sql.SQLException;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeInterface dao=null;
	public List<EmployeeDTO> getEmployees() throws SQLException{
		return dao.getEmployees();
	}
	
	

}
