package day7_Array;

import java.util.Scanner;

public class PrimeNoUsingMethod 
{
	public static boolean isPrime(int n)          //Static method
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) 
	{
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(isPrime(a[i]))
			{
				System.out.println(a[i]);
			}
		}

	}

}
