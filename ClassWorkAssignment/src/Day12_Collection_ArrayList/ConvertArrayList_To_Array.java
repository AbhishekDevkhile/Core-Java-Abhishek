

package Day12_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*Convert ArrayList To Array with All Possible Ways.*/
public class ConvertArrayList_To_Array {

	public static void main(String[] args) {
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
