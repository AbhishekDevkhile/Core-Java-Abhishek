package JavaTest7;

import java.util.ArrayList;

public class Program7 
{

	public static void main(String[] args) 
	{
			ArrayList<String> list1 = new ArrayList ();
			list1.add("Me");
			list1.add("You");
			list1.add("He");
			list1.add("She");
			list1.add("It");
			
			ArrayList <String> list2 = new ArrayList ();
			list2.add("You");
			list1.retainAll(list2);
			for (String temp : list1)
			{
			System.out.printf(temp + " " );
			System.out.println();
			}
	}
}