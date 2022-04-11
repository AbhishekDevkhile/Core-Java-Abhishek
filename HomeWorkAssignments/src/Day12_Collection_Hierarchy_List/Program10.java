package Day12_Collection_Hierarchy_List;

import java.util.ArrayList;

/*10.WAP to replace the second element of an ArrayList with the specified element.*/
public class Program10 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList();
		a1.add(89);
		a1.add(5);
		a1.add(16);
		a1.add(99);
		a1.add(2);
		a1.add(17);
		a1.add(11);
		a1.add(71);
		a1.add(81);
		System.out.println("Original Arraylist - "+a1);
		
		a1.set(1,99999);      //Set/change second postion element
		
		System.out.println("Replace second element with 99999 - "); 
		System.out.println(a1);
		            //Or
		/*  for(int i=0;i<a1.size();i++)
		  {
		  System.out.println(a1.get(i));
		  }
		  */

	}

}
