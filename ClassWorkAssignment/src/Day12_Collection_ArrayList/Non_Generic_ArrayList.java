package Day12_Collection_ArrayList;

import java.util.ArrayList;

public class Non_Generic_ArrayList {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(23);
		a1.add("Pratik");
		a1.add(10.45f);
		a1.add('k');
		
		
		System.out.println(a1);
		
		System.out.println("Using for loop:");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
	}

}
