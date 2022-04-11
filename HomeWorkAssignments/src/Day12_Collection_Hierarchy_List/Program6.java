package Day12_Collection_Hierarchy_List;

import java.util.ArrayList;
import java.util.Iterator;

/*6. WAP to add 1 to 50 numbers in ArrayList 
 and print only even numbers (using iterator) .*/
public class Program6 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList();
		for(int i=0;i<=50;i++)
		{
			al.add(i);
			System.out.println(al.get(i));
		}
		
		
		System.out.println("print only even numbers:");
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext())
		{
			
			Integer i=itr.next();
			if(i%2==0)
			{
				
				System.out.println(i);
			}
		}
		
		

	}

}
