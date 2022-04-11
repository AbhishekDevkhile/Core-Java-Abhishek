package Day12_Collection_Hierarchy_List;

import java.util.ArrayList;
import java.util.Scanner;

/*7.WAP to retrieve an element (at a specified index) from a given ArrayList.*/
public class Program7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String>al=new ArrayList();
		al.add("Nikhil");
		al.add("Chaitanya");
		al.add("Abhishek");
		al.add("Siddhant");
		al.add("Sushant");
		al.add("Pruthviraj");
		al.add("Gayatri");
		al.add("Neel");
		System.out.println("Arraylist"+al);
		
		
	//	System.out.println("The element at index 3 in the ArrayList is: " + al.get(3));
		
		String str=" ";
		for(int i=0;i<al.indexOf(al); )
		{
			System.out.println("Enter Index Position:");
			if(i==3)
			{
			str = al.get(i);
			break;
			}
		}
		System.out.println(str);
		
		
		
		al.add(2,"Kunal");
		System.out.println(al);
		
		al.set(3,"Abhi");
		
		System.out.println(al);
		
		
		
		
		

	}

}
