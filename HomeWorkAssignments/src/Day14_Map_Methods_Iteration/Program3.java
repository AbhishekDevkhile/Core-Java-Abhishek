package Day14_Map_Methods_Iteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*WAP to add elements to a HashMap using generics with Integer as Key and String as value. And 4 key-value entries.*/
public class Program3 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap();
		hm.put(10,"Z");
		hm.put(19,"P");
		hm.put(15,"Y");
		hm.put(14,"R");
		
		
		Set s=hm.entrySet();
		Iterator<Map.Entry<Integer,String>> itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer,String> m=itr.next();
			System.out.println(m.getKey()+"   "+m.getValue());
			
		}
		
		
		
		
		
		
		

	}

}
