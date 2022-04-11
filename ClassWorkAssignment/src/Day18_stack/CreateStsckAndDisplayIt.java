package Day18_stack;

import java.util.Iterator;
import java.util.Stack;

class Employee
{
	int empId;
	String empName;
	int empSalary;
	public Employee(int empId, String empName, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
}
public class CreateStsckAndDisplayIt {

	public static void main(String[] args)
	{
		Stack<Employee> s=new Stack();
		s.add(new Employee(101,"A",250000));
		s.add(new Employee(102,"B",220000));
		s.add(new Employee(103,"C",270000));
		s.add(new Employee(105,"D",240000));
		s.add(new Employee(104,"E",290000));
		
		System.out.println("Display using Iterator");
		Iterator<Employee>itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("/////////////////////////////////////////////////////////////");
		System.out.println("Using forEach");
		for(Employee e:s)
		{
			System.out.println(e);
		}
		
		System.out.println("////////////////////////////////////////////////////////////////");
		System.out.println("Using for loop ");
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s.get(i));
		}
		
		
	}

}
