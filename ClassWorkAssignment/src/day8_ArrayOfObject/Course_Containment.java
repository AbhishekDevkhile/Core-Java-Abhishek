package day8_ArrayOfObject;
/*Create a array of course ,it contains cid,cname,and student object ,student 
contains sid,sname.create array of course ane display.*/
import java.util.Scanner;

class Student1
{
	int sid;
	String sname;
	Student1(int id,String nme)
	{
		this.sid=id;
		this.sname=nme;
	}
	void StdDetails()
	{
		System.out.println("Student id::"+sid+"  "+"Student name::"+sname);
	}
	
}
public class Course_Containment {
	int cid;
	String cname;
	Student1 stud;
	Course_Containment(int id,String nm, Student1 std)
	{
		this.cid=id;
		this.cname=nm;
		this.stud=std;
	}
	void Courseshow()
	{
		System.out.println("Course id="+cid + " "+"Course Name=" +cname);
		stud.StdDetails();
	}

	public static void main(String[] args) {
		Course_Containment c[]=new Course_Containment[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<c.length;i++)
		{
			System.out.println("Enter course id");
			int id=sc.nextInt();
			System.out.println("Enter course name");
			String nm=sc.next();
			
			System.out.println("Enter Student id");
			int sid=sc.nextInt();
			System.out.println("Enter Student name");
			String nme=sc.next();
			
			//Student1 s=new Student1(sid,nme);
			
			
			c[i]=new Course_Containment(id,nm,new Student1(sid,nme));    //Using anynonomous object
			
			
		

	}
		for(int i=0;i<c.length;i++)
		{
			
			c[i].Courseshow();
			System.out.println("__________________");
		}

	}
}
