package day8_2D_Array;
/*Create int type of Array and check it is sparse matrix or not.*/
import java.util.Scanner;

public class SparseMatrixOrNot {

	public static void main(String[] args) {
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
				int count1=0;
				int count2=0;
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a[i].length;j++)
					{
						if(a[i][j]==0)
						{
							count1++;
						}
						else
						{
							count2++;
						}
					}
					
				}
				if(count1>count2)
				{
					System.out.println("is a sparse matrix");
				}
				else 
				{
					System.out.println("is a NOT sparse matrix");
				}
			}
				

	}

}
