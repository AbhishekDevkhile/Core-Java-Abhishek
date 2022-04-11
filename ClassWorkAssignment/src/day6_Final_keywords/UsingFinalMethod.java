package day6_Final_keywords;


class Student            
{
	int sid;
	String sname;
public final void Student(int e,String n)      //final method
 	{
	sid=e;
	sname=n;
	}
public String toString()
	{
	String str="Student id="+sid+" "+"Student name="+sname;
	return str;
	}
	}
/*
class Manager extends Employee //final class can not inherit
    {
      int eid;
      String ename;
      public final void Student(int e,String n)     //final method can not override
 	{
	
	}
	}
	*/

public class UsingFinalMethod {

	public static void main(String[] args) {

		Student s=new Student();
		s.Student(123,"Abhi");
		System.out.println(s);

	}

}
