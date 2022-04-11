package Day16_Collection_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Employee1 implements Comparable <Employee1>
{
	int empid;
	String empName;
	int empSalary;
	public Employee1(int empid, String empName, int empSalary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
	//Comparable interface
	
	@Override
	public int compareTo(Employee1 o) 
	{
		return o.empSalary-this.empSalary;
	}
	
	
}


public class Employee_Salarylessthan10k_increase10pre_displayDesecndingOrder {

	public static void main(String[] args) {
		HashSet<Employee1> s=new HashSet();
		
		s.add(new Employee1(101,"Abc",25000));
		s.add(new Employee1(102,"Def",5000));
		s.add(new Employee1(103,"Ghi",26000));
		s.add(new Employee1(104,"Jkl",9500));
		s.add(new Employee1(105,"Mno",10000));
		s.add(new Employee1(106,"Pqr",66000));
		s.add(new Employee1(107,"Stu",9000));
		
		
		System.out.println(s);
		System.out.println("---------------------------------------------");
		Iterator<Employee1>itr=s.iterator();
		while(itr.hasNext())
		{
			Employee1 e=itr.next();
			if(e.empSalary<10000)
			{
				e.empSalary=(int) (e.empSalary+(e.empSalary*0.1));
				//System.out.println(e);
			}
			//System.out.println(e);
		}
		
		TreeSet<Employee1> t=new TreeSet(s);    // in hashset we cannot maintain order then it convert into treeSet(In this statement),pass hashSet object in treeSet constructor
 		
		
		
		for(Employee1 e:t)
		{
			System.out.println(e);                    //Display treeSet
		}

	}

}
