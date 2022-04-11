package Day12_Collection_ArrayList_ComparableInterface;
import java.util.ArrayList;

import java.util.Collections;
class Student4 implements Comparable<Student4>
{
	int sid;
	String sname;
	int smarks;
	Student4(int id,String name,int mrk)
	{
		this.sid=id;
		this.sname=name;
		this.smarks=mrk;
	}
	public String toString()
	{
		return sid+"  "+sname+"  "+smarks;
	}
	//Generic comparable
	
  
@Override
public int compareTo(Student4 o) 
{
	//logic 1
	                                           
	if(this.sname.compareTo(o.sname)>0)        //String comparision 
	{
		return 1;
	}
	else if(this.sname.compareTo(o.sname)<0)
	{
		return -1;
	}
	else
		return 0;
	
	//logic 2
//	return this.sname.compareTo(o.sname);
	
}
}
public class Student_SortOnbasicOfMarks_GenericComparable_CustomArraylist {

	public static void main(String[] args) {
		ArrayList<Student4> c=new ArrayList();
		c.add(new Student4(111,"Abhishek",85));
		c.add(new Student4(113,"Neel",45));
		c.add(new Student4(114,"Yuvraj",45));
		c.add(new Student4(112,"Chaitanya",45));
		c.add(new Student4(113,"Nikhil",67));
		
		
		Collections.sort(c);
		System.out.println(c+"    ");
		

	}

}
