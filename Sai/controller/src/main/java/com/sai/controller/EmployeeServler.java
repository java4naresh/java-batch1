package com.sai.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.service.EmployeeService;

/**
 * Servlet implementation class EmployeeServler
 */
public class EmployeeServler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeService empService;
	
	public void addDependency() {
		ApplicationContext cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		empService=cxt.getBean(EmployeeService.class);
		
	}
	
    /**
     * Default constructor. 
     */
    public EmployeeServler() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		addDependency();
		try {
			
			response.getWriter().append(empService.getEmployees()+"");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}

}
