package Day12_Collection_ArrayList;
/*Create Astring Abd Integer type of arraylist and Sort those arrylist using Sort 
 "Sort" method and display it.*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UseSortMethod_IntegerAndString {

	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList();
		s.add("Abhishek");
		s.add("Pratik");
		s.add("Nainesh");
		s.add("Chaitanya");
		s.add("Yuvraj");
		s.add("Pruthviraj");
		s.add("Sanjay");
		s.add("Anil");
		
		System.out.println("Before Sorting:"+s);
		Collections.sort(s);
		System.out.println("After Sorting:"+s);

		
		ArrayList<Integer> a=new ArrayList();
		a.add(89);
		a.add(5);
		a.add(16);
		a.add(99);
		a.add(2);
		a.add(17);
		a.add(11);
		a.add(71);
		a.add(81);
		
		System.out.println("Before sorting:"+a);
		Collections.sort(a);
		System.out.println("After Sorting:"+a);
		
		
		//take input from User
		ArrayList<Integer>a1=new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter elements");
//			int x=sc.nextInt();
//			a.add(x);
			
			//Or
			
			a1.add(sc.nextInt());
			
		}
		System.out.println("Before sorting:"+a1);
		Collections.sort(a);
		System.out.println("After Sorting:"+a1);
		
	}

}
