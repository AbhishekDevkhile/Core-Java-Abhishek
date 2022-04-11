package day8_PatternsInArray;
/*Print Z pattern in array*/
import java.util.Scanner;
public class N_patternInArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter size of columns:");
		int cols=sc.nextInt();
		
		int[][] a=new int[rows][cols];
		int[][] b=new int[rows][cols];
		int[][] c=new int[rows][cols];
		
		System.out.println("Enter a Array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] =sc.nextInt();
			}
		}
		
		System.out.println("Enter b Array:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j] =sc.nextInt();
			}
		}
		//Addition logic
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j] =a[i][j]+b[i][j];
			}
			System.out.println();
		}
		
		
		
		//int[][] c=new int[][]{{1,2,3,4},{5,6,7,8},{9,8,7,6},{5,4,3,2}};
		
		
		//Z pattern logic
		for(int i=0;i<c.length;i++)
		{
			for(int j=c[i].length-1;j>=0;j--)
			{
				if(i==0  || i==j || i==c.length-1)
				{
					System.out.print(c[i][j]); 
					
					//System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}

	}
		

}
