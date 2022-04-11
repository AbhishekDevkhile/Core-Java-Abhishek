package Day12_Collection_ArrayList;
/*Write a java code to create arrayList and check its frequency and display its count.*/
import java.util.ArrayList;
import java.util.Iterator;

public class FrequencyOfStringUsingIterator
{

	public static void main(String[] args) 
	{
		ArrayList<String> s=new ArrayList();
		s.add("Nokia");
		s.add("Samsung");
		s.add("Nokia");
		s.add("Realmi");
		s.add("Oppo");
		s.add("Vivo");
		s.add("One+");
		s.add("Oppo");
		System.out.println("Actual ArrayList:"+s);
		
		ArrayList<String>al=new ArrayList();
		
		//Use iterator inside iterator(compare i and j type)
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			String i=itr.next();
			
			
			int count=0;
			Iterator<String> itr1=s.iterator();
			while(itr1.hasNext())
			{
				String j=itr1.next();
				if(i.equals(j))
				{
					count++;
					
				}
				
			}
			if(!al.contains(i))
			{
				al.add(i);
			System.out.println(i+"  "+count);
			}
			
			
		}

	}


}
