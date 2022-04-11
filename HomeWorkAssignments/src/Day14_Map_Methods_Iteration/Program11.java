package Day14_Map_Methods_Iteration;

import java.util.HashMap;

/*WAP to remove an element from HashMap using key.*/
public class Program11 {

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
		
		System.out.println("Before removing:");
		System.out.println(hm);
		System.out.println("Remove element:"+hm.remove(105));
		System.out.println("After removing:");
		System.out.println(hm);
		

	}

}
