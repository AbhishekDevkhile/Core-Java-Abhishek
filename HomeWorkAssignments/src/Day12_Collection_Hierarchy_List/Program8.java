package Day12_Collection_Hierarchy_List;

import java.util.ArrayList;

/*8.WAP to insert an element into the ArrayList at the first position.*/
public class Program8 {

	public static void main(String[] args) 
	{
		ArrayList<String>al=new ArrayList();
		al.add("Nikhil");
		al.add("Chaitanya");
		al.add("Abhishek");
		al.add("Siddhant");
		al.add("Sushant");
		al.add("Pruthviraj");
		al.add("Gayatri");
		al.add("Neel");
		System.out.println("Before"+al);
		
		al.add(0,"Ritu");
		System.out.println("After insert element into first position");
		System.out.println(al);

	}

}
