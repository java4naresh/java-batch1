package com.triveni.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet(name = "editEmployee", urlPatterns = { "/editEmployee" })
public class EditEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    private Connection con;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private int empId;
	
	private static final  String EDIT_Query="update  employee set empName=?,empSalary=?,empDesignation=? where empId=?";
	private static final  String SELECT_Query="select empName,empSalary,empDesignation from employe where empId=?";
	@Override
	public void destroy() {
		try {

			pst.close();
			rs.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "12345");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		try {
			String empIdstr=request.getParameter("empId");
			int enpId=Integer.parseInt(empIdstr);
			PreparedStatement pst=con.prepareStatement(SELECT_Query);
			pst.setInt(1,empId);
			ResultSet rs=pst.executeQuery();
			pw.write("<html>");
			pw.write("<body>");
			pw.write("<center>");
			pw.write("<form method='post'>");
			while (rs.next()) {
				pw.write("Employe Id:<input type='text' name='empId' value="+empId+"><br>");
				pw.write("Employe Name:<input type='text' name='emName' value="+rs.getString("empName")+"><br>");
				pw.write("Employe Salary:<input type='text' name='emSalary' value="+rs.getInt("empSalary")+"><br>");
				pw.write("Employe Designation:<input type='text' name='empDesignation' value="+rs.getString("empDesignation")+"><br>");
				pw.write("<input type='submit' name='Edit'>");
			}
			pw.write("</form>");
			pw.write("</center>");
			pw.write("</body>");
			pw.write("</html>");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.write("Edit Servlet");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String empSalarystr=request.getParameter("empSalary");
			int empSalary=Integer.parseInt(empSalarystr);
			String empIdstr=request.getParameter("empId");
			int empId=Integer.parseInt(empIdstr);
			PreparedStatement pst=con.prepareStatement(EDIT_Query);
			pst.setString(1,request.getParameter("empName"));
			pst.setInt(2,empId);
			pst.setInt(3,empSalary);
			pst.setString(4,request.getParameter("empDesignation"));
			PrintWriter pw=response.getWriter();
			pw.write("<html>");
			pw.write("<body>");
			pw.write("<center>");
			
			if(pst.executeUpdate()!=0) {
				pw.write("<p1 style=color:Green>Employee Edited Successfully</p1>");
			}
			else pw.write("<p1 style=color:red>Employee NotEdited Successfully</p1>");
			pw.write("<br><a href='index.html'>Home</a>");
	

			pw.write("</center>");
			pw.write("</body>");
			pw.write("</html>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().append("doPost");
	}

}
 