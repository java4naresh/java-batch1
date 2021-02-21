package com.sai.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {
           Connection con;
           PreparedStatement ps=null;
           ResultSet rs=null;
        		  
	
	
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		try {
			con.close();
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private Map<String, String> getUsers() {
		Map<String,String> users = new HashMap<>();
		try {
			ps = con.prepareStatement("select UserName,Password from users");
			rs = ps.executeQuery();
			while(rs.next()) {
				users.put(rs.getString("UserName"), rs.getString("Password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String user = request.getParameter("user");
		String password = request.getParameter("pwd");
		Map<String, String> users = getUsers();
		String actualPwd = users.get(user);
		if (actualPwd != null && password != null && actualPwd.equals(password)) {
			chain.doFilter(request, response);
		} else {
			response.getWriter().append("Invalid Credentials");
		}
		
		//chain.doFilter(request, response);
		}	
	
	

	public void init(FilterConfig fConfig) throws ServletException {
      try {
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch", "root", "sai25");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
