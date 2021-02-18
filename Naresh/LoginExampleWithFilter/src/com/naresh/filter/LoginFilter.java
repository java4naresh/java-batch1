package com.naresh.filter;

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
	PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Default constructor. 
     */
    public LoginFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
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

	
	private Map<String, String> getUsers() {
		Map<String,String> users = new HashMap<>();
		try {
			pst = con.prepareStatement("select userName,password from users");
			rs = pst.executeQuery();
			while(rs.next()) {
				users.put(rs.getString("userName"), rs.getString("password"));
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
		System.out.println(request.getLocalPort());
		System.out.println(request.getProtocol());
		String protocol = request.getProtocol();
		System.out.println(request.getRemotePort());
		
		/*if(!"HTTP/1.1".equals(protocol))
			chain.doFilter(request, response);
		else response.getWriter().append("Invalid Protocol");*/
		
		/*if(request.getRemotePort() == 49933) {
			chain.doFilter(request, response);
		}else response.getWriter().append("Invalid Port");*/
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}

}
