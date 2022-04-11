package Day12_Collection_ArrayListInsideArrayList;
/*ArrayList Inside ArrayList pass input from user Using forLoop */
import java.util.ArrayList;
import java.util.Scanner;

class Student1
{
	String sname;
	public Student1( String sname) {
		super();
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [ sname=" + sname + "]";
	}
	
}
class Course1
{
	int cid;
	String cname;
	ArrayList<String>al;
	public Course1(int cid, String cname,ArrayList al) 
	{
		super();
		this.cid = cid;
		this.cname = cname;
		this.al=al;
	}
	@Override
	public String toString() 
	{
		return "Course [cid=" + cid +""+ ", cname=" + cname +  "    "+al+ "]"+"\n";
	}	
}
public class ArrayListInsideArrayList_UsingForLoop {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		ArrayList<Course1> al=new ArrayList();
		
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter CId:");
			int id=s.nextInt();
			System.out.println("Enter CName:");
			String nm=s.next();
			
			//Create String type ArrayList inside Arraylist
			ArrayList<String> a=new ArrayList();
			for(int j=0;j<2;j++)
			{	
				System.out.println("Enter SName:");
				String snm=s.next();
				a.add(snm);				
			}
			al.add(new Course1(id,nm,a));	  //Pass String type object in Course1 Arraylist
		}
		System.out.println(al);
		
		

	}

}
