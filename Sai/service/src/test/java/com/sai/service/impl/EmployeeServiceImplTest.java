package com.sai.service.impl;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.mockito.Mock;

import com.sai.dao.EmployeeInterface;
import com.sai.dto.EmployeeDto;


public class EmployeeServiceImplTest {
	 
	@Mock
	private EmployeeInterface emp;
	
	
	private EmployeeServiceImpl impl;
	
	
	
	@Before
	public void before() {
	
		impl=new EmployeeServiceImpl();
		
	}
	public void getEmployeesTest() throws SQLException {
		   List<EmployeeDto> list=new ArrayList<EmployeeDto>();
		   EmployeeDto dto=new EmployeeDto("Jc",8,1008,"SE");
		   list.add(dto);
			when(emp.getEmployees()).thenReturn(list);
			list=impl.getEmployees();
			list.forEach(e->{
				assertTrue("Jc".equals(e.getEmpName()));
			});
		
			
		
		
	}
}
