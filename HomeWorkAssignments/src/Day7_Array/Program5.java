package Day7_Array;

import java.util.Scanner;

/*5. Take 10 integer inputs from user and store them in an array. Now, copy all 
 the elements in another array but in reverse order.*/
public class Program5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.println("Enter element on array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//copy from one to another Array
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("Print in reverse order: ");
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.println(b[i]);
		}

	}

}
