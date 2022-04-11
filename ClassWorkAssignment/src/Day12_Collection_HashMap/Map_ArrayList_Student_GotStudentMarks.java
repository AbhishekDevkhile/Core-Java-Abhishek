package Day12_Collection_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class Students
{
	int sid;
	String sname;
	int smarks;
	public Students(int sid, String sname, int smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + "]";
	}
	
	
}
public class Map_ArrayList_Student_GotStudentMarks 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,ArrayList<String>>hm=new HashMap();
		
		
		ArrayList<Students>al=new ArrayList();
		al.add(new Students(101,"Abhishek",85));
		al.add(new Students(102,"Chaitanya",45));
		al.add(new Students(103,"Nikhil",88));
		al.add(new Students(104,"Yuvraj",85));
		al.add(new Students(105,"Siddhant",46));
		al.add(new Students(106,"Pruthviraj",45));
		al.add(new Students(107,"Prateek",88));
		
		/*
		//Using forloop
		for(int i=0;i<al.size();i++)
		{
			ArrayList<String> al2=new ArrayList();
			for(int j=0;j<al.size();j++)
			{
				if(al.get(i).smarks==al.get(j).smarks)
				{
					al2.add(al.get(j).sname);
				}
			}
			hm.put(al.get(i).smarks,al2);
		}
		System.out.println(hm);
		*/
		
		//using Iterator
		
		Iterator<Students>itr=al.iterator();
		
		while(itr.hasNext())
		{
			Students s=itr.next();
			int mk=s.smarks;
			ArrayList<String> al3=new ArrayList();
			Iterator<Students>itr2=al.iterator();
			while(itr2.hasNext())
			{
				Students s2=itr2.next();
				if(s2.smarks==mk)
				{
					al3.add(s2.sname);
				}
				
			}
			hm.put(mk,al3);
		}
		System.out.println(hm);
		
		

	}

}
