package com.divya.dao;

import java.sql.SQLException;
import java.util.List;

import com.divya.dto.StudentDTO;

public interface StudentInterface 
{
	public List<StudentDTO> getStudents() throws SQLException;

}
