package Day8_2DArray;
/*8. WAP to create transpose of a matrix.*/
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter size of columns:");
		int cols=sc.nextInt();
		
		int[][] a=new int[rows][cols];
		int[][] b=new int[rows][cols];
		
		System.out.println("Enter a Array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] =sc.nextInt();
			}
		}
		
		System.out.println("Display given array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		//Transpose logic
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j] =a[j][i];
			}
		}
		
		System.out.println("After transpose matrix:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
			
				System.out.print(b[i][j]+"   ");
			}
			System.out.println();
		}

	}

}
