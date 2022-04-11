package Day14_Map_Methods_Iteration;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*Different ways to iterate over Map?*/
public class Program5 {

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
		
		System.out.println(hm);
		
		//Display using forEach loop
		System.out.println("Display using foreach loop");
		for(Map.Entry<Integer,String>m:hm.entrySet())
		{
			System.out.println(m.getKey()+"   "+m.getValue());
		}
		
		System.out.println("///////////////////////////////////////////////");
		
		//Display using Iterator
		System.out.println("Display using Iterator");
		Set s=hm.entrySet();
		Iterator<Map.Entry<Integer,String>>itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String>m=itr.next();
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		System.out.println("//////////////////////////////////////////////");
		
		//Display using KeySet() Method
		System.out.println("Display using KeySet() Method");
		
		Set<Integer> ss=hm.keySet();
		
	    Iterator<Integer>it=ss.iterator();
	    while(it.hasNext())
	    {
	    	Integer i=it.next();
	    	System.out.println(i+"   "+hm.get(i));
	    }
	    
	    System.out.println("///////////////////////////////////////////////");
	    
	    //Display using Collection
	    
	    System.out.println("Display using collection:");
	    Collection c=hm.values();
	    Iterator<String>itr1=c.iterator();
	    while(itr1.hasNext())
	    {
	    	System.out.println(itr1.next());
	    }
		

	}

}
