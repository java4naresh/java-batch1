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
 * Servlet implementation class Edit
 */
@WebServlet(name = "editEmployee", urlPatterns = { "/editEmployee" })
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private static final String EDIT_QUERY="update employee set empName=?,empSalary=?,designation=? where empId=?";
    private static final String SELECT_QUERY="select empName,empSalary,empId,designation from employee where empId=?";

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
    public Edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       PrintWriter pw=response.getWriter();
       try {
    	   String empIstr=request.getParameter("empId");
    	   int empId=Integer.parseInt(empIstr);  
    	 PreparedStatement ps=con.prepareStatement(SELECT_QUERY);
    	  ps.setInt(1, empId);
    	  ResultSet rs=ps.executeQuery();
    	  pw.write("<html>");
    	  pw.write("<body>");
    	  pw.write("<form method=post>");
    	  while(rs.next())
    	  {
    	   int empid=rs.getInt("empId");
    	   pw.write("employee Id:<input type='text' name='empId' value="+empId+"><br>");
    	   pw.write("employee Name:<input type='text' name='empName' value="+rs.getString("empName")+"><br>");
    	   pw.write("designation:<input type='text' name='des' value="+rs.getString("designation")+"><br>");
    	   pw.write("salary:<input type='text' name='sal' value="+rs.getInt("empSalary")+"><br>");
    	   pw.write("<input type='submit' name='edit'>");
    	  }
    	  pw.write("</form>");
    	  pw.write("</body>");
    	  pw.write("</html>");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       pw.write("Edit Servlet");
	 }
	@Override
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
  	 try {
	     String empsalst=req.getParameter("sal");
	        int esalary=Integer.parseInt(empsalst);
	       String empidst=req.getParameter("empId");
	       int eid=Integer.parseInt(empidst);
        PreparedStatement ps=con.prepareStatement(EDIT_QUERY);
        ps.setString(1, req.getParameter("empName"));
        ps.setInt(2, esalary);
        ps.setString(3, req.getParameter("des"));
        ps.setInt(4, eid);
        PrintWriter pw=res.getWriter();
		pw.write("<html>");
		pw.write("<body>");
		if(ps.executeUpdate() !=0) {
			pw.write("<p1 style=color:green>Values updated succesfully</p1>");
		}
			else {
				pw.write("<p1 style=color:green>Values not updated ");
		}
		pw.write("<br><a href='index.html'>home</a>");
		pw.write("</html>");
		pw.write("</body>");
} catch (SQLException e) {

e.printStackTrace();
}

		res.getWriter().append("post");
	}
	
	
	
    
}
