package Day14_Map_Methods_Iteration;

import java.util.ArrayList;
import java.util.HashMap;

/*13. ArrayList Contains
al.add(“pune”);
al.add(“Mumbai”);
al.add(“pune”);
al.add(“Mumbai”);
al.add(“Nasik”);
al.add(“pune”);
create HashMap which contain String as key and Integer as value
key is name of city and value is frequency of that city;
e.g m.put(“pune”,3);
m.put(“Mumbai”,2);
Print Map using For each loop.*/
public class Program13 {

	public static void main(String[] args) 
	{
		ArrayList<String>al=new ArrayList();
		al.add("pune");
		al.add("Mumbai");
		al.add("pune");
		al.add("Mumbai");
		al.add("Nasik");
		al.add("pune");
		
		System.out.println("Given ArrayList:"+al);
		
		HashMap<String,Integer>hm=new HashMap();
		
		for(int i=0;i<al.size();i++)
		{
			int count=1;
			boolean isvisited=false;
			for(int j=i-1;j>=0;j--)
			{
				if(al.get(i).equalsIgnoreCase(al.get(j)))
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				for(int k=i+1;k<al.size();k++)
				{
					if(al.get(i).equalsIgnoreCase(al.get(k)))
					{
						count++;
					}
				}
			hm.put(al.get(i),count);	
			}
		}
		System.out.println(hm);
		
		
	}

}
