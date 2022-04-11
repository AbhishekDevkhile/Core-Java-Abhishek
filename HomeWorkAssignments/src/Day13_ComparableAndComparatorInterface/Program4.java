package Day13_ComparableAndComparatorInterface;

import java.util.ArrayList;

/*There is ArrayList of string list1 { “sun” , “mon” ,”sun” , “tue” , “wed” , mon” }
Create LinkedList list2 which contains non-unique elements from list1.
 So list2 will be {“sun” , “mon” }.*/
public class Program4 {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList();
		al.add("Sun");
		al.add("Mon");
		al.add("Sun");
		al.add("Tue");
		al.add("Wed");
		al.add("Mon");
		System.out.println(al);
		
		ArrayList<String> al2=new ArrayList();
		
		String str=" ";	
		
		for(int i=0;i<al.size();i++)
	    {
			int count=1;
	        for(int j=i+1;j<al.size();j++)
	        {
	            if(al.get(i).equals(al.get(j)))
	            {
	            	count++;
	                
	            }
	        }
	        if(count>1)
	        {
	        	al2.add(al.get(i));
	        }
	    }
	    System.out.println("Print duplicate elements:"+al2);

	}

}
