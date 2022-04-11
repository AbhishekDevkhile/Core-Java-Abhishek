package Day16_Collection_TreeSet;
/*Create a course class. course contain cid,cname,cfees and sort the course on the 
 * basic of fees in descending order.Using comparator*/

import java.util.Comparator;
import java.util.TreeSet;

class Course
{
	int cid;
	String cname;
	int cfees;
	public Course(int cid, String cname, int cfees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfees = cfees;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cfees=" + cfees + "]";
	}
	
	
}

//Use Comparator

class mycom implements Comparator<Course>
{

	@Override
	public int compare(Course o1, Course o2) 
	{
		return o2.cfees-o1.cfees;
	}
	
}
public class Course_Fees_UsingComparator {

	public static void main(String[] args) 
	{
		TreeSet<Course> ts=new TreeSet(new mycom());
		
			ts.add(new Course(101,"Java",2999));
			ts.add(new Course(102,"MySql",3999));
			ts.add(new Course(103,"MEAN",10999));
			ts.add(new Course(104,"MERN",11999));
			ts.add(new Course(105,"c",6999));
			ts.add(new Course(106,"C++",5999));
		
		System.out.println(ts);

	}

}
