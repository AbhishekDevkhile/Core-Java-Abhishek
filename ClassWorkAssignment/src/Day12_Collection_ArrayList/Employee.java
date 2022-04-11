	package Day12_Collection_ArrayList;
/*WAJC to create a ArrayList of Employee Which Contain id,name & salary
 And Display it. */
import java.util.ArrayList;
import java.util.Iterator;



public class Employee 
{
	int eid;
	String ename;
	int sal;
	Employee(int id,String nm,int sal)
	{
		this.eid=id;
		this.ename=nm;
		this.sal=sal;
	}
	public String toString()
	{
		return "Emp id:"+eid+"  "+"Emp name:"+ename+"  "+" Emp salary:"+sal;  
	}

	public static void main(String[] args) 
	{
		ArrayList<Employee> s=new ArrayList();
		s.add(new Employee(101,"Abhishek",55000));
		s.add(new Employee(102,"Nikhil",58000));
		s.add(new Employee(103,"Chaitanya",65000));
		
		//1.Display forEach loop
		System.out.println("Employee details display forEach loop:");
		for(Employee x:s)
		{
			System.out.println(x);
		}
		
		//2.Display using Iterator
		System.out.println("Employee details display using Iterator  ");
		Iterator<Employee> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}

}
