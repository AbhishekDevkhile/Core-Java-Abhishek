package Day16_Collection_TreeSet;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSet_Collection {

	public static void main(String[] args) {
		TreeSet<String> tm=new TreeSet(new MyComTree());
		
		tm.add("Abhishek");
		tm.add("Chaitanya");
		tm.add("Nikhil");
		tm.add("Abhijeet");
		tm.add("Nainesh");
		tm.add("Nitin");
		
		System.out.println(tm);
//		
//		for(String x:tm)
//		{
//			System.out.println(x);
//		}
		
		// tm.descendingSet();
		

	}

}


class MyComTree implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
	
}
