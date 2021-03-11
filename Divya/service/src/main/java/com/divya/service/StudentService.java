package com.divya.service;

import java.sql.SQLException;
import java.util.List;

import com.divya.dto.StudentDTO;

public interface StudentService
{
	public List<StudentDTO> getStudents() throws SQLException;

}
