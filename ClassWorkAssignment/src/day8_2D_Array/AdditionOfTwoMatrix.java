package day8_2D_Array;

import java.util.Scanner;

/*Create two integer type of 2 D array and perform addition.*/
public class AdditionOfTwoMatrix {

	public static void main(String[] args) {

		
		
		int[][] a=new int[][] {{1,2,3},{4,5,6}};
		
		System.out.println("Enter A Array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");	
			}
			System.out.println();
		}
		
				
		int b[][]=new int[][] {{7,8,9},{0,5,9}};
		
		
		System.out.println(" Enter B array");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+"  ");
			}
			System.out.println();
		}
		
		int c[][]=new int[2][3];
		
		
		//Perform Addition logic
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i] [j];
			}
			System.out.println();
		}
		
		System.out.println("Display Addition of 2D array:");
		/*for(int[] z:c)
		{
			for(int y:z )
			{
				System.out.print(y +"  ");
			}
			System.out.println();
		}
		*/
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
		
		

	}

}
