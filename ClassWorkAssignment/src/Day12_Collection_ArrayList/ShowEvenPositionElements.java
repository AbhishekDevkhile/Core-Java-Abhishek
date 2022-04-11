package Day12_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*WAJC to show even position elements
 1.Using forloop
 2.Using Iterator 
 */
public class ShowEvenPositionElements 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(15);
		a.add(40);
		a.add(45);
		
		
		//1.Using forloop
		//Arraylist display using iterator
		Iterator<Integer>itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
 		}
		
		System.out.println("Even position element from array list:");
		for(int i=0;i<a.size();i++)
		{
			if(i%2==0)
			{
				System.out.println(a.get(i));
			}
		}
		
		//2.Using iterator
		//Even position element Display using iterator
		
		System.out.println("Even position element Display using iterator");
		
		Iterator<Integer> itr1=a.iterator();
		while(itr1.hasNext())                //Condition
		{
			System.out.println(itr1.next()); //print
			if(itr1.hasNext())    // if present next element in list 
			{
				itr1.next();         //then move Cursor moving
			}
			
		}

	}

}
