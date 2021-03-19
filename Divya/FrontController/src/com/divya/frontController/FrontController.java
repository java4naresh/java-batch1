package com.divya.frontController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println(request.getRequestURI());
		StudentService service = new StudentService();
		if(request.getRequestURI().contains("getAllStudents"))
		{
			response.getWriter().append(""+service.getAllStudents());
		}
		else if(request.getRequestURI().contains("getStudentById"))
		{
			int id=Integer.parseInt(request.getParameter("Id"));
			response.getWriter().append(""+service.getStudentById(id));
		}
		else if(request.getRequestURI().contains("insert"))
		{
			int id=Integer.parseInt(request.getParameter("Id"));
			String name=request.getParameter("Name");
			String mail=request.getParameter("Email");
			String branch=request.getParameter("Branch");
			int phone=Integer.parseInt(request.getParameter("PhNo"));
			StudentBO bo=new StudentBO();
			bo.setId(id);
			bo.setName(name);
			bo.setEmail(mail);
			bo.setBranch(branch);
			bo.setPhNo(phone);
			String msg=service.insertStudent(bo);
			response.getWriter().append(msg);
		}
		else if(request.getRequestURI().contains("delete"))
		{
			int id=Integer.parseInt(request.getParameter("Id"));
			response.getWriter().append(""+service.deleteStudent(id));

		}
		else
		{
			response.getWriter().append("Invalid Request");
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
