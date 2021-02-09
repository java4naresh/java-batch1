package com.jdbc.divya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlJoins
{

	public static void main(String[] args)
	{
		SqlJoins joins=new SqlJoins();
		joins.innerJoin();
		joins.leftJoin();
		joins.equiJoin();
		joins.rightJoin();
		joins.unionJoin();

	}
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "4420");
		return con;
	}
	public void equiJoin()
	{
		try
		{
			Connection conn=getConnection();
			//PreparedStatement ps = conn.prepareStatement("select * from emp,dept where emp.deptNo=dept.deptNo;");
			//PreparedStatement ps=conn.prepareStatement("select * from emp,dept where emp.deptNo = dept.deptNo and dname='Dev'");
			PreparedStatement ps=conn.prepareStatement("select * from emp,dept where eName='Divya' and emp.deptNo=dept.deptNo;");
			ResultSet rs=ps.executeQuery();
			System.out.println("------EQUI JOIN--------");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+","+rs.getString(2)+", "+ rs.getString(3));
			}
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void innerJoin()
	{
		
			try
			{
				Connection conn=getConnection();
				PreparedStatement ps=conn.prepareStatement("select * from emp inner join dept on emp.deptNo=dept.deptNo;");
				ResultSet rs=ps.executeQuery();
				System.out.println("--------INNER JOIN------------");
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+","+rs.getString(2)+", "+ rs.getString(3)+","+rs.getInt(4)+","+rs.getString(5));
				}

			} 
			catch (ClassNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public void leftJoin()
	{
		
			try
			{
				Connection conn=getConnection();
				PreparedStatement ps=conn.prepareStatement("select * from emp left join dept on emp.deptNo=dept.deptNo;");
				ResultSet rs=ps.executeQuery();
				System.out.println("---------LEFT JOIN------------");
				while(rs.next())
				{
					
					System.out.println(rs.getInt(1)+","+rs.getString(2)+", "+ rs.getString(3)+","+rs.getInt(4)+","+rs.getString(5));
				}

			} 
			catch (ClassNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public void rightJoin()
	{
		
			try
			{
				Connection conn=getConnection();
				PreparedStatement ps=conn.prepareStatement("select * from emp right join dept on emp.deptNo=dept.deptNo;");
				ResultSet rs=ps.executeQuery();
				System.out.println("---------RIGHT JOIN------------");
				while(rs.next())
				{
					
					System.out.println(rs.getInt(1)+","+rs.getString(2)+", "+ rs.getString(3)+","+rs.getInt(4)+","+rs.getString(5));
				}

			} 
			catch (ClassNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch blocks
				e.printStackTrace();
			}
	}
	public void unionJoin()
	{
		
			try
			{
				Connection conn=getConnection();
				PreparedStatement ps=conn.prepareStatement("select deptNo from emp union select deptNo from dept;");
				ResultSet rs=ps.executeQuery();
				System.out.println("---------UNION JOIN------------");
				while(rs.next())
				{
					
					System.out.println(rs.getInt(1));
				}

			} 
			catch (ClassNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}


}
