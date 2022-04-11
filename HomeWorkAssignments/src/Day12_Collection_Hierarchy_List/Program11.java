package Day12_Collection_Hierarchy_List;

import java.util.ArrayList;
import java.util.Iterator;

/*11.Create arraylist of string. Add 7 days to list (Monday , Sunday etc) remove 
 elements from list for which string length is more than 7.*/
public class Program11 {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList();
		al.add("Sunday");
		al.add("Monday");
		al.add("Thuesday");
		al.add("Wednesday");
		al.add("Thrusday");
		al.add("Friday");
		al.add("Saturday");
		System.out.println(al);
		
		System.out.println("remove elements length is more than 7.");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
		 if(itr.next().length() >= 7) 
		 {
		   itr.remove();
		  }
		}
		System.out.println(al);
		
		
		
		

	}

}
