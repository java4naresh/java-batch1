package com.divya.http;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpAnnotation
 */
@WebServlet("/HttpAnnotation")
public class HttpAnnotation extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Connection conn;
	
	@Override
	public void init(ServletConfig config) throws ServletException
	{
	   try
	   {
		 Class.forName("com.mysql.jdbc.Driver");
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1","root","4420");
	   } 
	   catch (SQLException e)
	   {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	   catch (ClassNotFoundException e) 
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpAnnotation() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String s1=request.getParameter("name");
		String s2=request.getParameter("phNo");
		String s3=request.getParameter("mailId");
		String s4=request.getParameter("password");
		PrintWriter pw=response.getWriter();
		pw.write("<html>");
		pw.write("<body>");
		pw.write("<table>");
		pw.write("<tr>");
		pw.write("<th>Name</th><th>PhNo</th><th>MailId</th><th>Password</th>");
		if(s1!=null && s2!=null && s3!=null && s4!=null)
		{
			pw.write("<tr>");
			pw.write("<td>"+s1+"</td>");
			pw.write("<td>"+s2+"</td>");
			pw.write("<td>"+s3+"</td>");
			pw.write("<td>"+s4+"</td>");
			pw.write("</tr>");

		}
		pw.write("</tr>");
		//pw.write("<p1>Registration Succesfull</p1>");
		pw.write("</table>");
		pw.write("</body>");
		pw.write("</html>");
		
		PreparedStatement ps;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			ps = conn.prepareStatement("insert into register values(?,?,?,?)");
			ps.setString(1,s1);
			ps.setString(2,s2);
			ps.setString(3,s3);
			ps.setString(4,s4);
			ps.executeUpdate();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
