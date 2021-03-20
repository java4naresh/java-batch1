package com.sai.controller;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         System.out.println(request.getRequestURI());
         ServiceSt ss=new ServiceSt();
         if(request.getRequestURI().contains("getallstudent")){
     		response.getWriter().append(""+ss.getAllStudentDeatils());

         }else if(request.getRequestURI().contains("getStudentById")) {
        	 int id=Integer.parseInt(request.getParameter("id"));
 			response.getWriter().append(""+ss.getStById(id));
        	 
         }else if(request.getRequestURI().contains("delete")) {
        	 int id=Integer.parseInt(request.getParameter("Id"));
 			response.getWriter().append(""+ss.deleteStudent(id));

        	 
         }else if(request.getRequestURI().contains("insert")) {
        	int id=Integer.parseInt(request.getParameter("id"));
        	String name=request.getParameter("name");
        	String address=request.getParameter("address");
        	String mobileno=request.getParameter("mobileNo");
        	     StudentBo b=new StudentBo();
        	     b.setId(5);
                 b.setName("Ram");
                 b.setAddress("Kp");
                 b.setMobileNo("7484847847");
         }else {
        
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
