package Day14_Map_Methods_Iteration;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/*WAP to get only the Values from a HashMap.*/
public class Program7 
{

	public static void main(String[] args) 
	{
		HashMap <Integer,String> hm=new HashMap();
		hm.put(101, "Abhishek");
		hm.put(102, "Nikhil");
		hm.put(103, "Chaitanya");
		hm.put(104, "Siddhant");
		hm.put(105, "Neel");
		hm.put(106, "Ritu");
		hm.put(107, "Arjun");
		
		Collection c=hm.values();
		Iterator<String>itr=c.iterator();
		while(itr.hasNext())
		{
			System.out.println("Values:"+itr.next());
		}

	}

}
