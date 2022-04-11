package Day7_Array;

import java.util.Scanner;

/*1. Take 10 integer inputs from user and store them in an array 
 and print them on screen.*/
public class Program1 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display Array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
		

	}

}
