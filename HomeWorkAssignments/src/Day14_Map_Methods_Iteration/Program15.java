package Day14_Map_Methods_Iteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*Create a hashmap which contains integer keys and String values. Take a string from user. Delete that entry in map 
 if value matches with the input string.*/
public class Program15 {

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
		
		System.out.println(hm);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input String:");
		String input=sc.next();
		/*
		
		int count=1;
		for(int i=0;i<hm.size();i++)
		{
			if(input.equalsIgnoreCase(hm.get(i)))
			{
				count++;
			}
		}
		if(count!=0)
		{
			System.out.println("Input is present.");
		}
		else
		{
			System.out.println("Input is not match.");
		}
        */
		
		Set s=hm.entrySet();
		int count1=0;
		String str=" ";
		Iterator<Map.Entry<Integer,String>>itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String>itr2=itr.next();
			if(input.equalsIgnoreCase(itr2.getValue()))
			{
				count1++;
				str=itr2.getValue();
			}
		}
		if(count1==1)
		{
			System.out.println(str);
		}
		else
		{
			System.out.println("key is not present.");
		}
		
		
		
	}

}
