package Day12_Collection_ArrayList;
/*Create a java code to create integer type of arrayList And display numbers
 with method*/
import java.util.ArrayList;

public class PrimeNumUsingMethod
{
	public static boolean isPrime(int n)          //Static method
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		//al.add(8);
		//al.add(9);
		//al.add(10);
		//al.add(11);
		//al.add(12);
		//al.add(13);
		
		int sum=0;
		for(int i=0;i<al.size();i++)
		{
		      if(isPrime(al.get(i))) 
		      {
		    	  sum=sum+al.get(i);
		    	 // System.out.println(al.get(i));
		      }
		}
		System.out.println(sum);
	}

}
