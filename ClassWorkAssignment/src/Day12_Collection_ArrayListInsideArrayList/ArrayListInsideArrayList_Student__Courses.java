package Day12_Collection_ArrayListInsideArrayList;
/*ArrayList Inside ArrayList pass each course has multiple student */
import java.util.ArrayList;

class Student11
{
	int sid;
	String sname;
	public Student11(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
class Course11
{
	int cid;
	String cname;
	ArrayList<String>al;
	public Course11(int cid, String cname,ArrayList al) 
	{
		super();
		this.cid = cid;
		this.cname = cname;
		this.al=al;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid +""+ ", cname=" + cname +  "    "+al+ "]"+"\n";
	}
	
	
}
public class ArrayListInsideArrayList_Student__Courses {

	public static void main(String[] args) 
	{
		ArrayList<String>a=new ArrayList();
		a.add("Amit");
		a.add("Neha");
		a.add("Pawan");
		
		ArrayList<String>b=new ArrayList();
		b.add("Chaitanya");
		b.add("Ganesh");
		
		
		ArrayList<String>c=new ArrayList();
		c.add("Swapanil");
		c.add("Abhijeet");
		c.add("Vidhya");
		
		ArrayList<String>d=new ArrayList();
		d.add("Abhishek");
		
		
		//Pass String object in Course11 Arraylist
		
		ArrayList<Course11> z=new ArrayList();
		z.add(new Course11(101,"Python",a));
		z.add(new Course11(102,"Java",b));
		z.add(new Course11(102,"MySql",c));
		z.add(new Course11(102,"Angular",d));
		
		System.out.println(z);

	}

}
