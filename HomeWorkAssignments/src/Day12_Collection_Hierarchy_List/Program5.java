package Day12_Collection_Hierarchy_List;

import java.util.ArrayList;
import java.util.Iterator;

/*5.There is arraylist of strings al { “sun” , “mon” ,”sun” , “tue” , “wed” , “mon” } 
 Create another arraylist al2 which contains unique elements from al .So al2 will 
 be {“sun” , “mon” , “tue”, “wed” }.*/
public class Program5 {

	public static void main(String[] args) 
	{
		ArrayList<String>al=new ArrayList();
		al.add("Sun");
		al.add("Mon");
		al.add("Sun");
		al.add("Tue");
		al.add("Wed");
		al.add("Mon");
		
		System.out.println("Before:"+al);
		
	    for(int i=0;i<al.size();i++)
	    {
	        for(int j=i+1;j<al.size();j++)
	        {
	            if(al.get(i).equals(al.get(j)))
	            {
	                al.remove(j);
	                j--;
	            }
	        }
	    }
	    System.out.println("After Removing duplicate:"+al);
	    
	    
	   /* 
		ArrayList<String>al2=new ArrayList();
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			if()
		}
		*/
		

	}

}
