package Day8_2DArray;
/*13. Create array of students, student has (roll, name, age, marks). Print only
Those students who have marks more than 60 and age is less than 15.*/

import java.util.Arrays;
import java.util.Scanner;

class Student 
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
		System.out.println("Student Details:");
		if(marks>60 && age<15)
		{
			System.out.println(id+"  "+name+"  "+marks+ "  "+age);
		}
		
	}
}
public class Program13 {

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

