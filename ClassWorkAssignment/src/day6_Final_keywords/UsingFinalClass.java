package day6_Final_keywords;

//demo of final class

final  class Employee            //final class
{
	int eid;
	String ename;
public void Employee(int e,String n)
 	{
	eid=e;
	ename=n;
	}
public String toString()
	{
	String str="empid="+eid+" "+"empname="+ename;
	return str;
	}
	}
/*
class Manager extends Employee //final class can not inherit
    {
      int eid;
      String ename;
	}
	*/
public class UsingFinalClass {

	public static void main(String[] args) {

		Employee e=new Employee();
		e.Employee(123,"Abhi");
		System.out.println(e);

	}

}
