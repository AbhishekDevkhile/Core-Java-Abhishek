package Day12_Collection_ArrayList;
/*Create Arraylist of course which contain CourseId,CourseName And Student Object Using 
GetterSetter Here Student Contain Sid,Sname.display it */
import java.util.ArrayList;
import java.util.Scanner;

class Student2
{
	int sId;
	String sName;
	public void setsId(int id)
	{
		this.sId=id;
		
	}
	public int getsId()
	{
		return sId;
		
	}
	public void setsName(String nm)
	{
		this.sName=nm;
		
	}
	public String getSName()
	{
		return sName;
		
	}
}
class Course
{
	int cid;
	String cname;
	Student2 s;
	public void setcId(int id)
	{
		this.cid=id;
		
	}
	public int getcId()
	{
		return cid;
		
	}
	public void setcName(String nm)
	{
		this.cname=nm;
		
	}
	public String getcName()
	{
		return cname;
		
	}
	public void setStudent(Student2 s)
	{
		this.s=s;
		
	}
	public Student2 getStudent()
	{
		return s;
		
	}
}
public class Course_ArraylistUsingGetterSetter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Course> list=new ArrayList();
		for(int i=0;i<2;i++)
		{
			
			Student2 s=new Student2();
			System.out.println("Enter Student Id:");
			int sid=sc.nextInt();
			System.out.println("Enter Student Name:");
			String snm=sc.next();
			s.setsId(sid);
			s.setsName(snm);  
			
			
			Course c1=new Course();
			System.out.println("Enter Course Id:");
			int cid=sc.nextInt();
			System.out.println("Enter Course Name:");
			String cnm=sc.next();
			c1.setcId(cid);
			c1.setcName(cnm);
			c1.setStudent(s);
			
			list.add(c1);	
		}
		for(Course x:list)
		{
			System.out.println(x.getcId()+"  "+x.getcName()+"  "+x.getStudent().getsId()+"  "+x.getStudent().getSName());
		}

	}

}
