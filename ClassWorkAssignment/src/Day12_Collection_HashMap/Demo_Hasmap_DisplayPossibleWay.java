package Day12_Collection_HashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo_Hasmap_DisplayPossibleWay {

	public static void main(String[] args) {
	
		HashMap<Integer,String>hm=new HashMap();
		
		hm.put(101, "a");
		hm.put(500, "p");
		hm.put(445, "t");
		
		System.out.println(hm);
		// Display using foreach
		for(Map.Entry<Integer, String> m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("//////////////////");
		
		// Display using Iterator
		Set s=hm.entrySet(); 
		
		Iterator<Map.Entry<Integer, String>> itr=s.iterator();
		
		
		while(itr.hasNext())
		{
			Map.Entry<Integer, String>m2=itr.next();
			System.out.println(m2.getKey()+" "+m2.getValue());
			
			//System.out.println(itr.next());
		}
		
		System.out.println("////////////");
		
		// Display using keySet method
		
		
		Set s2=hm.keySet();
	
		System.out.println(s2);
		
		Iterator<Integer>it=s2.iterator();
		while(it.hasNext())
		{
			Integer i=it.next();
			System.out.println(i+"....."+hm.get(i));
		}
		
		
		
		
		//using values() method
		
		Collection c=hm.values();
		
		System.out.println(c);
		
		//ArrayList<String>al=new ArrayList(c);
		ArrayList<String>al=new ArrayList(hm.values());
		System.out.println(al);
		

	}

}
