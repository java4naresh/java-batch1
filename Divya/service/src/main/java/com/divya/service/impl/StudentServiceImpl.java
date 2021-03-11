package com.divya.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divya.dao.StudentInterface;
import com.divya.dto.StudentDTO;
import com.divya.service.StudentService;
@Component
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentInterface student; //DAO Logic in service implementation
	public List<StudentDTO> getStudents() throws SQLException 
	{
		
		return student.getStudents();
	}

}
