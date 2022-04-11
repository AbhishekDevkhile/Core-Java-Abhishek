package Day12_Collection_Hierarchy_List;

import java.util.ArrayList;
import java.util.Iterator;

/*4. WAP to print all elements of ArrayList using -
-Iterator
-for loop
-for each
*/
public class Program4 {

	public static void main(String[] args) 
	{
		ArrayList<String>al=new ArrayList();
		al.add("Nikhil");
		al.add("Chaitanya");
		al.add("Abhishek");
		al.add("Siddhant");
		al.add("Sushant");
		
		System.out.println("1.Display using Iterator:");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

		System.out.println("2.Display using Forloop:");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("3.Display using Foreach:");
		for(String x:al)
		{
			System.out.println(x);
		}
		

	}

}
