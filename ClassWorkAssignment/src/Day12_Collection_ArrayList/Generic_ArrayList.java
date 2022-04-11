package Day12_Collection_ArrayList;

import java.util.ArrayList;

public class Generic_ArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList();
		a1.add(23);
		a1.add(222);
		a1.add(100);
		a1.add(58);
		
		
		System.out.println(a1);
		
		System.out.println("Using for loop:");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println("Using for each");
		for(Integer x:a1)
		{
			System.out.println(x);
		}
		

	}

}
