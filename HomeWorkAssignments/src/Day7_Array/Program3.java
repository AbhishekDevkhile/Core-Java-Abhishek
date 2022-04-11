package Day7_Array;
/*3. Take 10 integer inputs from user and store them in an array. Again ask user to give a 
  number. Now, tell user whether that number is present in array or not.*/
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter element on array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter User number:");
		int num=sc.nextInt();
		boolean found=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == num)
			{
				found=true;
			}
			
		}
		if(found)
		      System.out.println(found + " is found.");
		    else
		      System.out.println(found + " is not found.");
		//System.out.println(found+"    "+ "It is present on array");
		

	}
}
