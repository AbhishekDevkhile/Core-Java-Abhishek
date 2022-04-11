package Day12_Collection_ArrayList_ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
class Student3 implements Comparable
{
	int sid;
	String sname;
	int smarks;
	Student3(int id,String name,int mrk)
	{
		this.sid=id;
		this.sname=name;
		this.smarks=mrk;
	}
	public String toString()
	{
		return sid+"  "+sname+"  "+smarks;
	}
	//non generic comparable
	///@Override
	//logic 1
	public int compareTo(Object o) 
	{
	
		Student3 s=(Student3)o;         //casting Student3 to object o   //Integer comparision
		if(this.smarks>s.smarks)         //compare using Ascii value
		{
			return 1;
		}
		else if(this.smarks<s.smarks)
		{
			return -1;
		}
		else
			return 0;
		
		//or
		
		//logic 2
		//return this.smarks-s.smarks;
	}
}
public class Student_SortOnbasicOfMarks_NonGeneric_CustomArraylist {

	public static void main(String[] args) {
		ArrayList<Student3> c=new ArrayList();
		c.add(new Student3(111,"Abhishek",85));
		c.add(new Student3(112,"Chaitanya",45));
		c.add(new Student3(113,"Nikhil",67));
		
		
		Collections.sort(c);
		System.out.print(c);

	}

}
