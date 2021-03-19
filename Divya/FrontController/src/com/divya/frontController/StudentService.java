package com.divya.frontController;

import java.util.ArrayList;
import java.util.List;

public class StudentService
{
	static List<StudentBO> students=new ArrayList<>();
	static
	{
		StudentBO std1=new StudentBO();
		std1.setId(40);
		students.add(std1);
	}
	public List<StudentBO> getAllStudents()
	{
		
		return students;
		
	}
	public StudentBO getStudentById(int Id)
	{
		return students.get(Id);
		
	}
	public String insertStudent(StudentBO bo)
	{
		students.add(bo);
		return "Success";
	}
	public String deleteStudent(int Id)
	{
		students.remove(Id);
		return "Success";
	}
}
