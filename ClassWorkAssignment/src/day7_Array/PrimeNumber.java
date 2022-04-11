package day7_Array;

import java.util.Scanner;

public class PrimeNumber {
	
	
	
	public static void main(String[] args) 
	{
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		/*First logic*/
//		for(int i=0;i<a.length;i++)
//		{
//			boolean isPrime=true;
//			
//			for(int j=2;j<a[i];j++)
//			{
//				if(a[i]%j==0)
//				{
//					isPrime=false;
//					break;
//				}
//			}
//			if(isPrime)
//			{
//				System.out.println(a[i]);
//			}
//		}
		
		/*Second logic*/
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(a[i]);
			}
		}
	
		
	}

}
