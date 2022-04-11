package Day14_Map_Methods_Iteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*WAP to get all the entries from a HashMap. Iterate the entries and print the Key & Value.*/
public class Program4 {

	public static void main(String[] args)
	 {
		HashMap<Integer,String> hm=new HashMap();
		hm.put(101, "Nikhil");
		hm.put(102, "Chaitanya");
		hm.put(103, "Yuvraj");
		hm.put(105, "Nitin");
		hm.put(104, "Aanand");
		
		
		Set s=hm.entrySet();
		Iterator<Map.Entry<Integer,String>> itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer,String> m=itr.next();
			System.out.println("Keys: "+m.getKey()+"    "+"Values: "+m.getValue());
		}
		
		

	}

}
