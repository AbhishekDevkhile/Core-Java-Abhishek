package Day14_Map_Methods_Iteration;

import java.util.HashMap;

/*WAP to copy all of the mappings from the specified HashMap to another map.*/
public class Program8 {

	public static void main(String[] args) 
	{
		HashMap <Integer,String> hm=new HashMap();
		hm.put(101, "Abhishek");
		hm.put(102, "Nikhil");
		hm.put(103, "Chaitanya");
		hm.put(104, "Siddhant");
		hm.put(105, "Neel");
		hm.put(106, "Ritu");
		hm.put(107, "Arjun");
		
		//Method 1
		HashMap<Integer,String>hm2=new HashMap();
		hm2.putAll(hm);                       //Copy one to another
		System.out.println(hm2);
		
		//Method 2
		Object m2= hm.clone();                //to make copy of map
		
		System.out.println(m2);
		
		

	}

}
