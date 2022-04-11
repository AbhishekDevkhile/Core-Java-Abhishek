package Day8_2DArray;

import java.util.Scanner;

/*3. There is Student class { int id , string name ,Boolean isspecial , Course c }.
Course {String cname , int fees } Assume that there is array of 10 student objects.
Write a program to set isspecial to be true if course fee of that student is 
more than 50000.*/
class Course
{
	String cname;
	int fees;
	Course(String nm,int fee)
	{
		this.cname=nm;
		this.fees=fee;
	}
	void DisplayCourseDetails()
	{
		if(fees>50000)
		{
			System.out.println("Course name:"+cname+"  "+"Course fees:"+fees);
		}
	}	
}
class Student1
{
	int id;
	String name;
	Boolean isspecial;
	Course c;
	Student1(int id,String nm,Course c)
	{
		this.id=id;
		this.name=nm;
		this.c=c;
	}
	void DisplayStudentDetails()
	{
		
		System.out.println("Student id:"+id+"  "+"Student name:"+name);
		c.DisplayCourseDetails();
	}	
}
public class Program3 
{
	public static void main(String[] args) 
	{
		Student1 st[]=new Student1[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println("Enter Student id:");
			int sid=sc.nextInt();
			System.out.println("Enter Student name:");
			String snm=sc.next();
			System.out.println("Enter Course name:");
			String cnm=sc.next();
			System.out.println("Enter Course fees:");
			int fe=sc.nextInt();
		
		st[i]=new Student1(sid,snm,new Course(cnm,fe));
	
		}
		System.out.println("Display those Course fees>50000:");
		for(int i=0;i<st.length;i++)
		{
			st[i].DisplayStudentDetails();
		}
		
	}

}
