package day8_ArrayOfObject;

import java.util.Scanner;

public class EmployeeUsingloop 
{
	
	int id;
	String name;
	int salary;
	
	EmployeeUsingloop(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println(id+"  "+name+"  "+salary);
	}

	public static void main(String[] args) 
	{
		EmployeeUsingloop e[]=new EmployeeUsingloop[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String nm=sc.next();
			System.out.println("Enter salary");
			int slry=sc.nextInt();
			
			e[i]=new EmployeeUsingloop(id,nm,slry);
		}
		
		for(int i=0;i<e.length;i++)
		{
			e[i].display();
		}

	}

}
