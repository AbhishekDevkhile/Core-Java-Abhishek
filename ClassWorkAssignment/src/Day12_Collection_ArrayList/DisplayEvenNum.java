package Day12_Collection_ArrayList;
/*Display even Array number from array list*/
import java.util.ArrayList;
import java.util.Iterator;

public class DisplayEvenNum 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add(15);
		a.add(40);
		a.add(45);
	//	System.out.println("Array list is:"+a);
		
		//Display collection list using iterator
		
		Iterator<Integer>itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Even element from array list:");
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)%2==0)
			{
				System.out.println(a.get(i));
			}
		}

	}

}
