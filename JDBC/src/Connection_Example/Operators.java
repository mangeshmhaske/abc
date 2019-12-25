package Connection_Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Operators {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		College c=new College();
		List<Student> list=c.m1();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test5","root","root");
		Statement smt=con.createStatement();
		String sql="select * from Student where addr IS NOT NULL";
		
		ResultSet rs=smt.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}	

	}

}
