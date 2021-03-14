package com.triveni.service.impl;

import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class EmployeeServiceImplTest {

	@InjectMocks
	private EmployeeServiceImpl impl;

	@Mock
	private EmployeeInterface dao;

	@Before
	public void before() {
		impl = new EmployeeServiceImpl();
	}

	@Test
	public void getEnployeesTest() throws SQLException {
		List<EmployeeDTO>list=new ArrayList();
		when(dao.getEmployees()).thenReturn(list);
		impl.getEmployees();

	}
}
