package Day12_Collection_HashMap;

import java.util.HashMap;
import java.util.Scanner;

class Employee
{
	int empid;
	String empname;
     int empsalary;
	public Employee(int empid,String empname, int empsalary) {
		super();
		this.empid = empid;
		this.empname=empname;
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid +" " + ",Empname="+ empname +", empsalary=" + empsalary + "]";
	}
     
}
public class Employee_empSalary 
{

	public static void main(String[] args)
	{
		HashMap<Employee,Integer>hm=new HashMap();
		
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter emp id:");
			int id=sc.nextInt();
			System.out.println("Enter emp name:");
		    String nm=sc.next();
			System.out.println("Enter emp salary:");
			int sl=sc.nextInt();
			Employee e=new Employee(id,nm,sl);
			
			hm.put(e, e.empsalary);
		}
		
		
		System.out.println(hm);

	}

}
