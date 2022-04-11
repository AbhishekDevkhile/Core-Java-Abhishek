package Day14_Map_Methods_Iteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*WAP to get only the Keys from a HashMap*/
public class Program6 {

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
		
		Set<Integer> s=hm.keySet();
		Iterator<Integer>itr=s.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			System.out.println("Key:"+i);
		}
		
		

	}

}
