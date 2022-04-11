package Day12_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*Create one String type of array list And perform sorting*/
public class String_Sorting 
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
		
		System.out.println("Before Sorting:"+s);
		
	/*	Collections.sort(s);
		System.out.println("After Sorting:"+s);
			*/
		
		
		String temp=" ";
		for(int i=0;i<s.size();i++)
		{
			for(int j=i+1;j<s.size();j++)
			{
				if(s.get(i).compareTo(s.get(j))>0)
				{
					temp=s.get(i);
					s.set(i,s.get(j));
					s.set(j,temp);
					
				}
			}
			
		}
		System.out.println("After Sorting:"+s);

	}

}
