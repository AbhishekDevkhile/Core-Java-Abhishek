package Day12_Collection_Hierarchy_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*9.WAP to convert ArrayList to array in 2  different ways and array
 to ArrayList in 2 different ways (so total 4 ways).*/
public class Program9 {

	public static void main(String[] args) {
		//convert Array to Arraylist
		String[] col= {"red","Brown","Purple","Blue","Black","White","Green"};
		
		//Method 1: Conversion using Arrays.asList()
		System.out.println("Conversion using Arrays.asList()");
		ArrayList<String> al=new ArrayList<String>( Arrays.asList(col));
		System.out.println(al);
		
		//Method 2:Collections.addAll method
	    System.out.println("Collections.addAll method:");
		Collections.addAll(al, col);    // Conversion .addAll method
		System.out.println(al);
		/*for (String str: col)
		{
			System.out.println(str);
		}*/
		
		System.out.println("////////////////////////////////////////////////////////////");
		//Convert Arraylist to Array
		ArrayList<Integer> a1=new ArrayList();
		a1.add(89);
		a1.add(5);
		a1.add(16);
		a1.add(99);
		a1.add(2);
		
		//Method 1: Conversion using toArray() method
		System.out.println("Conversion using toArray() method");
		Object b[]=a1.toArray();
		System.out.println(Arrays.toString(b));
		

		//Method 2: Manual way of conversion using ArrayList get() method
		System.out.println("Manual way of conversion using ArrayList get() method");
		Integer array[] = new Integer[a1.size()]; 
		for(int j =0;j<a1.size();j++)
		{
			array[j] = a1.get(j); 
		} 
		for(Integer k: array)
		{ 
			System.out.println(k); 
		}
		
		
		
	}

}
