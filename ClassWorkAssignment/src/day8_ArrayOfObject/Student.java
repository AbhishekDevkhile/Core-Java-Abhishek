package day8_ArrayOfObject;
/*Create array of student .student has sid,sname,smarks.
 create array using getter setter*/
import java.util.Scanner;

public class Student 
{	
	int sid;
	String sname;
	int smark;
	public void setId(int id)
	{
		this.sid=id;
	}
	public void setName(String nm)
	{
		this.sname=nm;
	}
	public void setMark(int mrk)
	{
		this.smark=mrk;
	}
	public int getId()
	{
		return sid;
	}
    public String getName()
    {
    	return sname;
    }
    public float getMark()
    {
    	return smark;
    }
	public static void main(String[] args) {
		Student s[]=new Student[3];
		Scanner sc=new Scanner(System.in);
		
		//Student a=new Student();
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String nm=sc.next();
			System.out.println("Enter marks");
			int mrk=sc.nextInt();
			
			Student a=new Student();
			a.setId(id);
			a.setName(nm);
			a.setMark(mrk);
			
			s[i]=a;
		}
		
		System.out.println("Display Details::");
		for(int j=0;j<s.length;j++)
		{
			System.out.println(s[j].getId());
			System.out.println(s[j].getName());
			System.out.println(s[j].getMark());
			System.out.println("__________________");
		}
	}

}
