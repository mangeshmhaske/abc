package Connection_Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

//using prepared statement
//using batch update
public class Test1
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	  College c=new College();
	  List<Student> list=c.m1();
	  
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test5","root","root");
	  String sql="insert into Student values(?,?,?)";
	  
	  PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
	  
	  for(Student stu:list)
	  {
		  ps.setInt(1, stu.getId());
		  ps.setString(2, stu.getName());
		  ps.setString(3, stu.getAddr());
	//	  ps.execute();
		 ps.addBatch();
	  }
	  ps.executeBatch();
	  System.out.println("data inserted");
   con.close();
	}

}

