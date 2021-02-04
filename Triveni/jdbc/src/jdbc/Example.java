package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Example {

	public static void main(String[] args) {
		Connection con=null;
		java.sql.Statement stmt=null;
		ResultSet rs=null;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1","root","12345");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from employe");
			/*List<Employe> stds=new ArrayList<>();
			while(rs.next()) {
				Employe s=new Employe();
				s.setEmpId(rs.getInt("empId"));
				s.setEmpName(rs.getString("empName"));
				s.setEmpSalary(rs.getDouble("empSalary"));
				s.setEmpDesignation(rs.getString("empDesignation"));
				stds.add(s);*/
				
				System.out.println("rs.getInt(1)" +"rs.getString(2)" +	"rs.getDouble(3)"	+ "rs.getString(4)"	);
			//}
			//System.out.println(stds);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}

