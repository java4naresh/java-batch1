package com.divya.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divya.dao.StudentInterface;
import com.divya.dto.StudentDTO;

@Component
public class StudentImpl implements StudentInterface
{
	@Autowired
	private Connection conn;

	public List<StudentDTO> getStudents() throws SQLException
	{

			PreparedStatement ps=conn.prepareStatement("select Id,Name,Email,Branch,PhNo from student");
			ResultSet rs=ps.executeQuery();
			List<StudentDTO> list=new ArrayList<StudentDTO>();
			while(rs.next())
			{
				StudentDTO std=new StudentDTO(rs.getInt("Id"), rs.getString("Name"),rs.getString("Email"), rs.getString("Branch"),rs.getInt("PhNo"));
				list.add(std);
			}
			return list;
		
	}

}
