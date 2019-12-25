package Connection_Example;

import java.util.ArrayList;
import java.util.List;

public class College
{
 
	public List<Student> m1()
	{
		Student s1=new Student();
		s1.setId(15);
		s1.setName("joo");
		s1.setAddr("pune");
		
		Student s2=new Student();
		s2.setId(16);
		s2.setName("deepak");
		s2.setAddr("talegaon");
		
		Student s3=new Student();
		s3.setId(17);
		s3.setName("pravin");
		s3.setAddr("jalgaon");
		
		List l=new ArrayList();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		return l;
		
	}
}
