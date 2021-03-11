package com.divya.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.divya.service.StudentService;

/**
 * Servlet implementation class EmployeeServlet
 */

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentService stdService=null; //Service class
	public void addDependency()
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		stdService=app.getBean(StudentService.class);
	}

    /**
     * Default constructor. 
     */
    public StudentServlet()
    {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		addDependency();
		try
		{
			response.getWriter().append(stdService.getStudents()+"");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
