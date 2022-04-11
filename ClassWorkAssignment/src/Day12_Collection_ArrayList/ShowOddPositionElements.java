package Day12_Collection_ArrayList;
/*WAJC to show Odd position elements
1.Using forloop
2.Using Iterator 
*/
import java.util.ArrayList;
import java.util.Iterator;

public class ShowOddPositionElements
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
		
		System.out.println("Odd position element from array list:");
		for(int i=0;i<a.size();i++)
		{
			if(i%2!=0)
			{
				System.out.println(a.get(i));
			}
		}
		
		//2.Using iterator
		//Odd position element Display using iterator
		
		System.out.println("Odd position element Display using iterator");
		
		Iterator<Integer> itr1=a.iterator();
		while(itr1.hasNext())
		{
			itr1.next();           //current position
			if(itr1.hasNext())         //if check next element in arraylist
			{
				System.out.println(itr1.next());    //print current curser position   element
			}
			
		}

		

	}

}
