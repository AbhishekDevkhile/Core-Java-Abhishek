package day7_Array;

import java.util.Scanner;

public class AdditionOfOddLocationelenent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size=sc.nextInt();
		System.out.println("Enter elements: ");
		
		int a[] = new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				sum=sum+a[i];
			}
			
		}
		System.out.println("Addition of odd location elements: "+sum);

		}
}
