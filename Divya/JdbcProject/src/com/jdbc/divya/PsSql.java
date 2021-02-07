package com.jdbc.divya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PsSql
{

	public static void main(String[] args)
	{
		PsSql queries=new PsSql();
		queries.orderBy();
		queries.having();
		queries.sum();
		queries.avg();
		queries.max();
		queries.min();
		queries.betweenAnd();
		queries.in();
		queries.like();
		queries.isNull();
	}
	//Non static method for connection to all the methods(ReUse)
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "4420");
		return con;
	}
	//Order by Clause
	public void orderBy()
	{
		try 
		{
			Connection conn=getConnection();
			//PreparedStatement ps = conn.prepareStatement("select * from javabatch1.employee order by empName");
			//ORDER BY clause in descending order
			PreparedStatement ps = conn.prepareStatement("select * from javabatch1.employee order by empName desc;");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+","+rs.getString(2)+", "+ rs.getString(3)+","+rs.getInt(4));
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
	//Having Clause
	public void having()
	{
		try
		{
			Connection conn=getConnection();
			PreparedStatement ps = conn.prepareStatement("select count(empName), max(sal) from employee group by designation having max(sal)>90000 ");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+","+rs.getInt(2));
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
	//FUNCTIONS- SUM
	public void sum()
	{
		try 
		{
			Connection conn=getConnection();
			//PreparedStatement ps = conn.prepareStatement("select sum(sal) from employee");
			PreparedStatement ps=conn.prepareStatement("select sum(sal) from employee where designation='hr'");
			ResultSet rs=ps.executeQuery();
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
	//AVERAGE FUNCTION
	public void avg()
	{
		try
		{
			Connection conn=getConnection();
			//PreparedStatement ps=conn.prepareStatement("select avg(sal) from employee");
			PreparedStatement ps=conn.prepareStatement("select avg(sal) from employee where designation='hr'");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
			}

		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//MAX FUNCTION
	public void max()
	{
		try 
		{
			Connection conn=getConnection();
			PreparedStatement ps=conn.prepareStatement("select max(sal) from employee");
			ResultSet rs=ps.executeQuery();
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
	//MIN FUNCTION
	public void min()
	{
		try 
		{
			Connection conn=getConnection();
			PreparedStatement ps=conn.prepareStatement("select min(sal) from employee");
			ResultSet rs=ps.executeQuery();
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
	//BETWEEN-AND Operator(Used for range of values)
	public void betweenAnd()
	{
		try 
		{
			Connection conn=getConnection();
			PreparedStatement ps=conn.prepareStatement("select empName,sal from employee where sal between 50000 and 80000");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(1)+","+rs.getInt(2));
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
	//IN Operator is used when there are multiple OR conditions of same coloumn
	public void in()
	{
		try 
		{
			Connection conn=getConnection();
			PreparedStatement ps=conn.prepareStatement("select * from employee where designation in('hr','SrDev')");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+","+rs.getString(2)+", "+ rs.getString(3)+","+rs.getInt(4));
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
	//LIKE OPERATOR - pattern matching
	public void like()
	{
		try 
		{
			Connection conn=getConnection();
			//PreparedStatement ps=conn.prepareStatement("select * from employee where empName like 'D%'"); // Starts with D%
			PreparedStatement ps=conn.prepareStatement("select * from employee where empName like '%A'"); //Ends with %A
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+","+rs.getString(2)+", "+ rs.getString(3)+","+rs.getInt(4));
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
	//IS-NULL Operator is to work with null values
	public void isNull()
	{
		try 
		{
			Connection conn=getConnection();
			//PreparedStatement ps=conn.prepareStatement("select * from employee where sal is null"); ---No rows selected because there is no null values
			PreparedStatement ps=conn.prepareStatement("select * from employee where sal is not null");
			ResultSet rs=ps.executeQuery();
			System.out.println("----------Not Null Values--------");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+","+rs.getString(2)+", "+ rs.getString(3)+","+rs.getInt(4));
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
