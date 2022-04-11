package Day12_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class String_RemoveEvenPositionEle 
{

	public static void main(String[] args) 
	{
		ArrayList<String> s=new ArrayList();
		s.add("Abhishek");
		s.add("Pratik");
		s.add("Nainesh");
		s.add("Chaitanya");
		s.add("Yuvraj");
		s.add("Pruthviraj");
		s.add("Sanjay");
		s.add("Anil");
		
		System.out.println("Actual list:"+s);
/*
		
		//1.Using forloop
		System.out.println("Even position from array list:");
		for(int i=0;i<s.size();i++)
		{
			if(i%2==0)
			{
			//	System.out.println(s.get(i));
				s.remove(i);
			
			}
			//i--;
			//i++;
			
		}
		System.out.println(s);
		
		
	*/	
		
		
	//2.Using iterator	
		
	System.out.println("remove even postion element using iterator method ");
		Iterator<String> iter = s.iterator();
		while (iter.hasNext()) 
		{ 
			iter.next();
			iter.remove();
			if (iter.hasNext())
			{
				System.out.println(iter.next());
			}
		
		}
		System.out.println("After removing::"+s);
		
		
		

	}

}
