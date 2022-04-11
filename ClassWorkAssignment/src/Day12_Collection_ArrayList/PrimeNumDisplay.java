package Day12_Collection_ArrayList;
/*Create a java code to create integer type of arrayList And display numbers
*/
import java.util.ArrayList;
import java.util.Iterator;

public class PrimeNumDisplay
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList();
		
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		
		
		System.out.println(al);
		System.out.println("Prime numbers are:");
	
		for(int i=0;i<al.size();i++)
		{
			int count =0;
			for(int j=2;j<al.get(i);j++)
			{
				if(al.get(i)%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(al.get(i));
			}
		}
		
		

	}

}
