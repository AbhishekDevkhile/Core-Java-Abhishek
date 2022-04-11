package Day12_Collection_ArrayList;
/*Create a Arraylist of employee type ,employee has id,name,salary .And display using getter setter*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee1
{
	int eid;
	String ename;
	int esalary;
	public void setEmpID(int id)
	{
		this.eid=id;
		
	}
	public int getEmpID()
	{
		return eid;
		
	}
	public void setEmpName(String nm)
	{
		this.ename=nm;
	}
	public String getEmpName()
	{
		return ename;
		
	}
	public void setEmpSalary(int sal)
	{
		this.esalary=sal;
	}
	public int getEmpSalary()
	{
		return esalary;
		
	}
	
	
}
public class Employee_gettersetter
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee1> s=new ArrayList();
		
		for(int i=0;i<=2;i++)
		{
			Employee1 e=new Employee1();
			
			System.out.println("Enter Empid:");
			int id=sc.nextInt();
			System.out.println("Enter Empname:");
			String nm=sc.next();
			System.out.println("Enter EmpSalary:");
			int sal=sc.nextInt();
			
			e.setEmpID(id);
			e.setEmpName(nm);
			e.setEmpSalary(sal);
			
			s.add(e);                                 //Add all e object value 
		}
		//1.using foreach loop
		for(Employee1 x:s)
		{
			System.out.println("Employee id:"+x.getEmpID());
			System.out.println("Employee EmpName:"+x.getEmpName());
			System.out.println("Employee EmpSalary:"+x.getEmpSalary());
			
			
		}
		
		//2.Using iterator
				System.out.println("Employee details Display using iterator:");
				Iterator<Employee1> itr=s.iterator();
				while(itr.hasNext())
				{
					Employee1 s1=itr.next();                  
					System.out.println(s1.getEmpID()+"  "+s1.getEmpName()+"  "+s1.getEmpSalary());
					
				}
		
		

	}

}
