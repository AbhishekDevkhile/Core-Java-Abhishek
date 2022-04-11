package Day12_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Convert Array into Arrraylist with all possible ways*/
public class ConvertArrayIntoArrayList 
{

	public static void main(String[] args)
	{
		Integer a[]= {10,20,30,52,89,45,26,20};
		
	    ArrayList<Integer> arraylist= new ArrayList<Integer>();  //ArrayList declaration
	   
	    //Method 1:Collections.addAll method
	    System.out.println("Collections.addAll method");
		Collections.addAll(arraylist, a);    // Conversion .addAll method
		
		for (Integer str: a)
		{
			System.out.println(str);
		}
		
		
		//Method 2: Manual way of doing things
		System.out.println("Manual way of doing things");
		for(int i =0;i<a.length;i++) 
		{  
			arraylist.add(a[i]);     //We are adding each array's element to the ArrayList
		}
		for (Integer str: a)
		{
			System.out.println(str);
		}
		
		//Method 3: Conversion using Arrays.asList()
		System.out.println(" Conversion using Arrays.asList()");
		ArrayList<Integer> arraylist1= new ArrayList<Integer>(Arrays.asList(a));
		for (Integer str: a)
		{ 
			System.out.println(str); 
		}

	}

}
