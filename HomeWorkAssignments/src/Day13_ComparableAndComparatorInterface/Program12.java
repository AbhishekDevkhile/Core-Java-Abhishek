package Day13_ComparableAndComparatorInterface;
/*Create Emp class with empid,empName,empSalary. Create 2 ArrayList<Emp> say list1 
 and list2. Make a LinkedList by joining both list1 and list.
a.Sort resultant LinkedList in descending order of salary and if salary is same then
 sort it by empName, if empNames are also same then sort it by empId*/

import java.util.ArrayList;
import java.util.Collections;


class Employee implements Comparable<Employee> 
{
	int empid;
	String empName;
	int empSalary;
	public Employee(int empid, String empName, int empSalary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	//Generic interface
	
	@Override
	public int compareTo(Employee o) {
		if(o.empSalary>this.empSalary)
		{
			return 1;
		}
		else if(o.empSalary<this.empSalary)
		{
			return -1;
		}
		else 
		{
			if(this.empName.compareTo(o.empName)>0)
			{
				return 1;
			}
			else if(this.empName.compareTo(o.empName)<0)
			{
				return -1;
			}
			else 
			{
				if(o.empid>this.empid)
				{
					return 1;
				}

				else if(o.empid<this.empid)
				{
					return -1;
				}

				else
				{
					return 0;
				}
			}
		}
	}
	
}

public class Program12 {

	public static void main(String[] args)
	{
		ArrayList<Employee> s=new ArrayList();
		s.add(new Employee(101,"Abhishek",55000));
		s.add(new Employee(102,"Nikhil",58000));
		s.add(new Employee(103,"Chaitanya",65000));
		s.add(new Employee(104,"Abhishek",21000));
		s.add(new Employee(108,"Nikhil",53000));
		s.add(new Employee(105,"Yuvraj",65000));
		s.add(new Employee(106,"Siddhant",56000));
		s.add(new Employee(109,"Swapnil",63000));
		s.add(new Employee(107,"Chaitanya",61000));
		
		Collections.sort(s);
		System.out.println(s);
		

	}

}
