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
 * Servlet implementation class Delete
 */
@WebServlet(name = "deleteEmployee", urlPatterns = { "/deleteEmployee" })
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private static final String DELETE_QUERY="delete from employee where empId=?";
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
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw=response.getWriter();
		String empstr=request.getParameter("empId");
		    int empId=Integer.parseInt(empstr);
		   try {
			PreparedStatement ps=con.prepareStatement(DELETE_QUERY);
		    ps.setInt(1, empId);
		    pw.write("<html>");
			pw.write("<body>");
			if(ps.executeUpdate() !=0) {
				pw.write("<p1 style=color:green>Values deleted succesfully</p1>");
			}
				else {
					pw.write("<p1 style=color:green>Values not deleted");
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
