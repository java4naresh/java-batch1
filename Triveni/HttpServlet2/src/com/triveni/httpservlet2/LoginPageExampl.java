package com.triveni.httpservlet2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginPageExampl
 */
@WebServlet("/LoginPageExampl")
public class LoginPageExampl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Map<String,String>users=new HashMap<>();
	static {
	users.put("Mouni", "mouni");
	users.put("Divya", "divya");
	users.put("Triveni", "triveni");
	}
	
	

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPageExampl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user =request.getParameter("user");
		String pwd =request.getParameter("pwd");
		PrintWriter pw=response.getWriter();
		pw.write("<html>");
		pw.write("<body>");
		pw.write("<center>");
		if(users.get(users.get(user)) != null) {
			if(pwd.equals(users.get(user)))
			{
				pw.write("<p1 style='color:green'> Welcome to the page</p1>");
			}else {
				pw.write("<p1 style='color:red'> Invalid Password</p1>");
			}
		}
			else {
				pw.write("<p1 style='color:red'> Invalid User</p1>");
			}
			pw.write("<html>");
			pw.write("<body>");
			pw.write("<center>");
		
	}

}
