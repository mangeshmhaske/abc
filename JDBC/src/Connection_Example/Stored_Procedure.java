package Connection_Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.CallableStatement;

public class Stored_Procedure
{
 
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	 
		College c=new College();
		List<Student> list=c.m1();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test5","root","root");
	//	String sql="insert into Student values(?,?,?)";
	    CallableStatement cs=(CallableStatement) con.prepareCall("{call ss(?,?,?)}");
	    cs.setInt(1, 60);
	    cs.setString(2, "xyz");
	    cs.setString(3, "akurdi");
	    cs.execute();
	    System.out.println("store procedure created");
	}
}
