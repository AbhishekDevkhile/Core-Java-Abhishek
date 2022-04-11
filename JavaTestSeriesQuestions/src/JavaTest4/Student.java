package JavaTest4;

import java.util.Arrays;
import java.util.Scanner;

public class Student 
{
	int id;
	String name;
    int age;
	int marks;

	Student(int id,String name,int age,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.age=age;
	}

	void display()
	{
		System.out.println("Marks above 60%:");
		if(marks>60 && age<15)
		{
			System.out.println(id+"  "+name+"  "+marks+ "  "+age);
		}
		
	}

	public static void main(String[] args) {

		Student s[]=new Student[2];	
	

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Details::");
		for(int i=0;i<s.length;i++)
		{
			System.out.println("enter id:");
			int id=sc.nextInt();
			System.out.println("enter name:");
			String nm=sc.next();
			System.out.println("enter age:");
			int age=sc.nextInt();
			System.out.println("enter marks:");
			int marks=sc.nextInt();
			
		
			Student st=new Student(id,nm,age,marks);
		
			s[i]=st;
	
		}
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}
	
		
	
	}
}


