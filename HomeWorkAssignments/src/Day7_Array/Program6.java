package Day7_Array;

import java.util.Scanner;

/*6. Write a program to find the sum and product of all elements of an array.*/
public class Program6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size=sc.nextInt();
		System.out.println("Enter element: ");
		int a[]=new int[size];
		
		int sum=0;
		int product=1;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//find Sum
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of given array::"+sum);
		
		//Find product
		for(int i=0;i<a.length;i++)
		{
			product=product*a[i];
		}
		System.out.println("Product of given array::"+product);
	}

}
