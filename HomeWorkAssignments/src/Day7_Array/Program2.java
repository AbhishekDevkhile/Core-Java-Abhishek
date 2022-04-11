package Day7_Array;

import java.util.Scanner;

/*2. WAP to print the alternate values from an array.*/
public class Program2 {

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
		System.out.println("Display Array with alternate values:");
		for(int i=0;i<a.length;i++)
		{
			if(i%2 != 0)
			{
				System.out.println(a[i]);
			}
		}
		
		

	}

}
