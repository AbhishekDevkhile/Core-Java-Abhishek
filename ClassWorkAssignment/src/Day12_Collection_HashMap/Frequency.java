
package Day12_Collection_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Frequency {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList();
		al.add("Red");
		al.add("Green");
		al.add("Red");
		al.add("Blue");
		al.add("White");
		al.add("Red");
		al.add("White");
		al.add("Blue");
		
		HashMap<String,Integer> m= new HashMap(); 
		
		for(int i=0;i<al.size();i++)
		{
			int count=1;
			boolean isVisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(al.get(i).equalsIgnoreCase(al.get(k)))
				{
					isVisited=true;
					break;
				}
			}
			if(isVisited==false)
			{
				for(int j=i+1;j<al.size();j++)
				{
					if(al.get(i).equalsIgnoreCase(al.get(j)))
					{
						count++;
						
					}
				}
				m.put(al.get(i), count);
			}
		}
		System.out.println(m);
		
		
		
		//Way 2:Using Iterator
		
		Iterator<String>itr=al.iterator();
		
		HashMap<Integer,String>m1=new HashMap<Integer,String>();
		while(itr.hasNext())
		{
			int count1=0;
			String str=" ";
			String s=itr.next();
			
			Iterator<String> itr1=al.iterator();
			while(itr1.hasNext())
			{
				String s2=itr1.next();
				if(s.equalsIgnoreCase(s2))
				{
					count1++;
					str=s2;
				}
			}
			if(!m1.containsKey(str))
			{
				m1.put(count1,s);
				
			}
		}
		System.out.println(m1);
		

	}

}
