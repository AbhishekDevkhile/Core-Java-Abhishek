package day8_ArrayInsideArray;

import java.util.Scanner;

class Student2
{
	int sid;
	String sname;
	Student2(int id,String snm)
	{
		this.sid=id;
		this.sname=snm;
		
	}
	void studentDetails()
	{
		System.out.println("Student id:"+sid+"   "+"Student name:"+sname);
		
	}
}
public class Course 
{
	int cid;
	String cname;
	Student2[] std;
	
	Course(int id,String cnm, Student2[] s )
	{
		this.cid=id;
		this.cname=cnm;
		this.std=s;
	}
	void showDetails()
	{
		System.out.println("Course id:"+cid+"   "+"Course name:"+cname);
	
		for(Student2 s:std)
		{
			s.studentDetails();
		}
	}

	public static void main(String[] args) {

		Course c[]=new Course[2];
		System.out.println("Enter Course details:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<c.length;i++)
		{
			System.out.println("Enter cid ");
			int id=sc.nextInt();
			System.out.println("Enter cname:");
			String cnm=sc.next();
			
			
			Student2 s[]=new Student2[2];
			for(int j=0;j<s.length;j++)
			{
				System.out.println("Enter sid ");
				int sid=sc.nextInt();
				System.out.println("Enter sname:");
				String snm=sc.next();
				
				s[j]=new Student2(sid,snm);
			}
				c[i]=new Course(id,cnm,s);	
		}
		System.out.println("Details:");
		for(int i=0;i<c.length;i++)
		{
			System.out.println("--------------------");
			c[i].showDetails();
		}

	}

}
