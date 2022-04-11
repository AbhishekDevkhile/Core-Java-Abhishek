package Day12_Collection_ArrayList;
/*Create Arraylist of course which contain CourseId,CourseName And Student Object Using 
Constructor Here Student Contain Sid,Sname.display it */
import java.util.ArrayList;
class Student1
{
	int sid;
	String sname;
	Student1(int id,String name)
	{
		this.sid=id;
		this.sname=name;
	}
	public String toString()
	{
		return sid+"  "+sname;
	}
}

public class Course_ArraylistUsingContaiment 
{
	int courseId;
	String CourseName;
	Student1 s;
	Course_ArraylistUsingContaiment(int cid,String cname,Student1 s)
	{
		this.courseId=cid;
		this.CourseName=cname;
		this.s=s;
	}
	public String toString() 
	{
		return courseId+"  "+CourseName+" "+s;
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Course_ArraylistUsingContaiment> c=new ArrayList();
		c.add(new Course_ArraylistUsingContaiment(101,"English",new Student1(111,"Abhishek")));
		c.add(new Course_ArraylistUsingContaiment(102,"Marathi",new Student1(112,"Chaitanya")));
		c.add(new Course_ArraylistUsingContaiment(103,"Hindi",new Student1(113,"Nikhil")));
		
		
		
		System.out.println("Course details display Using forEach loop:");
		for(Course_ArraylistUsingContaiment x:c)
		{
			System.out.println(x);
		}

	}

}
