package Day14_Map_Methods_Iteration;

import java.util.HashMap;

/*WAP to test if a HashMap contains a mapping for the specified key.*/
public class Program9 {

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
		
		System.out.println("106 key is present Or Not:   "+hm.containsKey(103));
		System.out.println("200 key is present Or Not:   "+hm.containsKey(200));
		

	}

}
