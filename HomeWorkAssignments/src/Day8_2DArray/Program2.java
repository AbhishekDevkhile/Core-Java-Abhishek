package Day8_2DArray;

import java.util.Scanner;

/*2. Employee class with fields (empno, empname, dept) where dept is object of department 
  class with fields (deptId, deptname) Write a program to create array of 3 employees 
  each employee will have different department.*/
class Department
{
	int deptid;
	String deptname;
	
	Department(int did,String dname)
	{
		this.deptid=did;
		this.deptname=dname;
	}
	
	void showDeptDetails()
	{
		System.out.println(deptid +"  "+deptname);
	}
}
class Employee
{
	int empnum;
	String empname;
	Department dept;
	
	Employee(int eno ,String ename,Department dept )
	{
		this.empnum=eno;
		this.empname=ename;
		this.dept=dept;
	}
	void showEmpDetails()
	{
		System.out.println(empnum +"  "+empname);
		dept.showDeptDetails();
	}
}
public class Program2 
{
	public static void main(String[] args) 
	{
		Employee e[]=new Employee[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter Employee num:");
			int eid=sc.nextInt();
			System.out.println("Enter Employee name:");
			String enm=sc.next();
			System.out.println("Enter dept number:");
			int dno=sc.nextInt();
			System.out.println("Enter Dept name:");
			String dnm=sc.next();
			
			
			e[i]=new Employee(eid,enm,new   Department(dno,dnm));
		}
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Display Details:"); 
			e[i].showEmpDetails();
		}
		
		
		

	}

	
}
