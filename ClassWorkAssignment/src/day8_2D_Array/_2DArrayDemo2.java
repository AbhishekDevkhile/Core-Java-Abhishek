package day8_2D_Array;
/*2 D Array User input (Using Scanner)*/
import java.util.Scanner;

public class _2DArrayDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows and cols to have in 2D array:");
		System.out.println("Enter num of rows::");
		int rw=sc.nextInt();
		System.out.println("Enter num of cols::");
		int col=sc.nextInt();
		
		int a[][]=new int[rw][col];
		
		System.out.println("Length of array(No of rows):"+a.length);
		
		System.out.println("Enter arry elements:");
		
		
		
	/*	for(int i=0;i<rw;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();			
			}
		}
		   */   
		
		
					//OR
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
		

	}

	

}
