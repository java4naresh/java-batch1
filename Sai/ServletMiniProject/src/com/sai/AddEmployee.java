package com.sai;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet(name = "addEmployee", urlPatterns = { "/addEmployee" })
	public class AddEmployee extends HttpServlet {
		private static final long serialVersionUID = 1L;
		private Connection con;
	    private PreparedStatement ps=null;
	    private ResultSet rs=null;
    private static final String INSERT_QUERY="insert into employee (empName,empSalary,empId,designation) values(?,?,?,?)";

    @Override
	public void init() {
		   try {
				Class.forName("com.mysql.jdbc.Driver");
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch", "root", "sai25");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	@Override
	public void destroy(){
		try {
			con.close();
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String empName=request.getParameter("empName");
      String empSalaryst=request.getParameter("sal");
      int empSalary=Integer.parseInt(empSalaryst);
      String empIdt=request.getParameter("empId");
      int empId=Integer.parseInt(empIdt);
      String designation=request.getParameter("des");
	     try {
			PreparedStatement ps=con.prepareStatement(INSERT_QUERY);
			ps.setString(1, empName);
			ps.setInt(2, empSalary);
			ps.setInt(3, empId);
			ps.setString(4, designation);
			PrintWriter pw=response.getWriter();
			pw.write("<html>");
			pw.write("<body>");
			if(ps.executeUpdate() !=0) {
				pw.write("<p1 style=color:green>Values inserted succesfully</p1>");
			}
				else {
					pw.write("<p1 style=color:green>Values not inserted ");
			}
			pw.write("<br><a href='index.html'>home</a>");
			pw.write("</html>");
			pw.write("</body>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
      
	}	
	
}
