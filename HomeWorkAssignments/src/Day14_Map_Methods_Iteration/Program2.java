package Day14_Map_Methods_Iteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*2. WAP to add elements to a HashMap without using generics (i.e. do not use <>) and print content of it. 
 * Use Integer as Key and String as Value. In second HashMap add elements of String type as Key and Integer as Value.*/
public class Program2 {

	public static void main(String[] args) 
	{
		HashMap hm1=new HashMap();
		hm1.put(101,"A");
		hm1.put(106,"B");
		hm1.put(104,"C");
		hm1.put(103,"P");
		hm1.put(102,"Q");
		hm1.put(105,"R");
		System.out.println(hm1);
		System.out.println("/////////////////////////////////////////");
		HashMap<Integer,String> hm2=new HashMap();
		hm2.put(101,"A");
		hm2.put(106,"B");
		hm2.put(104,"C");
		hm2.put(103,"P");
		hm2.put(102,"Q");
		hm2.put(105,"R");
		
		
		Set s=hm2.entrySet();
		Iterator<Map.Entry<Integer,String>> itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer,String> m=itr.next();
			System.out.println(m.getKey()+"      "+m.getValue());
		}
		
		
		
		
		

	}

}
