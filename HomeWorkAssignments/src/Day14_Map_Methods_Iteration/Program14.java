package Day14_Map_Methods_Iteration;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/*Write a program to create a hashmap as follows. A hashmap ‘oldMap’ has multiple duplicate values. Write a program to 
 create new hashmap ‘newMap’ which contains keys as unique values of ‘oldMap’ and values as count of number of times 
 value has appeared in ‘map’.
e.g. oldMap = (1, ‘a’) , (2,’b’), (3,’c’), (4,’b’), (5,’a’), (6,’a’)
newMap = {‘a’,3) , (‘b’,2),(‘c’,1)*/
public class Program14 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String>hm=new HashMap();
		hm.put(1,"a");
		hm.put(2,"b");
		hm.put(3,"c");
		hm.put(4,"b");
		hm.put(5,"a");
		hm.put(6,"a");
		
		System.out.println("Old HashMap:"+hm);
		
		HashMap<String,Integer>hm2=new HashMap();
		
		Collection c=hm.values();
		Iterator<String>itr=c.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			int c1=Collections.frequency(c, s);
			hm2.put(s,c1);
		}
		System.out.println(hm2);
		
		
		
		

	}

}
