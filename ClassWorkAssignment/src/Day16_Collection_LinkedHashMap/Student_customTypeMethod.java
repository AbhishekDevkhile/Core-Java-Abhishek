package Day16_Collection_LinkedHashMap;
/*If map contain custom type of key then override the hash code and equal method in custom object*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class Student
{
	
	int sid;
	String sname;
	int smark;
	public Student(int sid, String sname, int smark) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smark = smark;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smark=" + smark + "]";
	}
	//Custom type method(Override)
	//1. generate hashcode() and Equals() methods Using sid
	
	@Override
	public int hashCode() {
		return sid;
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		if(this.sid==s.sid)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	
	//2. generate hashcode() and Equals() methods Using sname
	/*
	@Override
	public int hashCode() {
		return sname.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student s1=(Student)obj;
		if(this.sname==s1.sname)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	*/
	
	
	//3. generate hashcode() and Equals() methods Using sid And sname
//		@Override
//		public int hashCode() {
//			return sname.hashCode();
//		}
//		@Override
//		public boolean equals(Object obj) {
//			Student s=(Student)obj;
//			if(this.sid==s.sid   &&  this.sname==s.sname)
//			{
//				return true;
//			}
//			else 
//			{
//				return false;
//			}
//			
//		}
	
}

public class Student_customTypeMethod {

	public static void main(String[] args) 
	{
		LinkedHashMap<Student,String>hm=new LinkedHashMap();
		hm.put(new Student(101,"amit",78), "Pune");
		hm.put(new Student(105,"Rohit",85), "Mumbai");
		hm.put(new Student(105,"Mohit",65), "Goa");
		hm.put(new Student(109,"Abhi",79), "Nashik");
		hm.put(new Student(104,"Virat",55), "Banglor");
		
		
		for(Map.Entry<Student, String>m:hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		

	}

}
