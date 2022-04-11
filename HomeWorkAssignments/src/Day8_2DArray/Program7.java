package Day8_2DArray;

import java.util.Scanner;

/*7. WAP to find sum of each column of a matrix.*/
public class Program7 
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
			
			int colsum=0;
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					colsum=colsum+a[j][i];
				}
				System.out.println(colsum);
			}
			

	}

}
