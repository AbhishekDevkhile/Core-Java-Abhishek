package day8_2D_Array;
/*find out the Sum and average of each cols */
import java.util.Scanner;

public class AvgOfEachColumns {

	public static void main(String[] args) {
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
			
			
			
			System.out.println("Find out cols array sum and average:");
			int csum;
			double cavg=0;
			
			
			for(int i=0;i<a.length;i++)
			{
				csum=0;
				for(int j=a[i].length-1;j>=0;j--)
				{
				//for(int j=0;j<a[i].length;j++)
				//{
					csum=csum+a[j][i];
				}
				System.out.println((i+1)+"  Sum of cols:"+csum);
				cavg=csum/col;
				System.out.println((i+1)+"  Average of cols:"+cavg);
			
				
			}


	}

}
