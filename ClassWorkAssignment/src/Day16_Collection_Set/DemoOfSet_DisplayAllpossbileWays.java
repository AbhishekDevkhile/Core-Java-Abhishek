package Day16_Collection_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoOfSet_DisplayAllpossbileWays {

	public static void main(String[] args) {
		HashSet st=new HashSet();
		st.add("pune");
		st.add(34.8);
		st.add('y');
		
		Set<Integer>s=new HashSet();
		s.add(101);
		s.add(102);
		s.add(103);
		System.out.println(s.add(104));
		System.out.println(s.add(104));
		
		System.out.println(s);
		
		
		
		System.out.println("Using foreach loop:");
		for(Integer x:s)
		{
			System.out.println(x);
		}
		
		
		//Using iterator
		System.out.println("Using iterator:");
		Iterator<Integer>itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		

	}

}
