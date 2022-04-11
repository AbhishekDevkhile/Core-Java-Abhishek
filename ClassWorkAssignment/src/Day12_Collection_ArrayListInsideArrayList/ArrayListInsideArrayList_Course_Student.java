package Day12_Collection_ArrayListInsideArrayList;
/*Arraylist inside Arraylist*/
import java.util.ArrayList;

class Students
{
	int sid;
	String sname;
	public Students(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
class Courses
{
	int cid;
	String cname;
	ArrayList<String>al;
	public Courses(int cid, String cname,ArrayList al) 
	{
		super();
		this.cid = cid;
		this.cname = cname;
		this.al=al;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname +  "    "+al+ "]";
	}
	
	
}
public class ArrayListInsideArrayList_Course_Student 
{
	public static void main(String[] args) 
	{
		
		ArrayList<String>a=new ArrayList();
		a.add("Amit");
		a.add("Neha");
		a.add("Pawan");

		ArrayList<Courses> c=new ArrayList();
		c.add(new Courses(101,"Python",a));
		c.add(new Courses(102,"Java",a));
		System.out.println(c);
		


	}

}
