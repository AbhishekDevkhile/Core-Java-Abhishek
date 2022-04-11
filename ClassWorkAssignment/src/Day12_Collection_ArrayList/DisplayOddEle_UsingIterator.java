package Day12_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class DisplayOddEle_UsingIterator 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> b=new ArrayList();
		b.add(10);
		b.add(55);
		b.add(46);
		b.add(12);
		b.add(99);
		b.add(33);
		
	/*	Iterator<Integer> itr=b.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Even element from array list:");
		for(int i=0;i<b.size();i++)
		{
			if(b.get(i)%2!=0)
			{
				System.out.println(b.get(i));
			}
		}
*/
		
		Iterator<Integer> itr=b.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			if(i%2!=0)
			{
				System.out.println(i);
			}
			
		}
	}

}
