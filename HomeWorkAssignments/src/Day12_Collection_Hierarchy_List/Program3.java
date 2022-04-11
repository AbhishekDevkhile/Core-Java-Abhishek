package Day12_Collection_Hierarchy_List;

import java.util.ArrayList;

/*3. WAP add elements to arraylist without using generics, 0th location keep Integer,
  1st location String now print each element and display contents.*/
public class Program3 {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add(25);
		al.add("Abhishek");
		
		
		System.out.println("Display Arraylist:");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		

	}

}
