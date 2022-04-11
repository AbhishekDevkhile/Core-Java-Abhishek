	package day8_2D_Array;
/*find out the Sum and average of each rows */

import java.util.Scanner;

public class AverageOfEachRow 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows and cols to have in 2D array:");
		System.out.println("Enter num of rows::");
		int rw=sc.nextInt();
		System.out.println("Enter num of cols::");
		int col=sc.nextInt();
		
		int a[][]=new int[rw][col];
		
		System.out.println("Enter arry elements:");
	
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					a[i][j]=sc.nextInt();			
				}
			}
			System.out.println("Array elements are:");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.print (a[i][j]+"  ");
				}
				System.out.println();
			}
			
			/*
			 //logic using for() loop
			System.out.println("Find out row array sum and average:");
			int rsum;
			double ravg=0;
			for(int i=0;i<a.length;i++)
			{
				rsum=0;
				for(int j=0;j<a[i].length;j++)
				{
						rsum=rsum+a[i][j];
				}
				System.out.println((i+1)+"  Sum of rows:"+rsum);
				ravg=rsum/rw;
				System.out.println((i+1)+"  Average of rows:"+ravg);
				
			}
	       */
			
			//logic using for-each loop
			for(int[] x:a )
			{
				int rowsum=0;
				double rowavg=0;
				
				for(int y:x)
				{
					rowsum=rowsum+y;
				}
				System.out.println("Sum of rows:"+rowsum);
				rowavg=rowsum/col;
				System.out.println("Average of rows:"+rowavg);
			}
			

	}

}
