package Day8_2DArray;
/*1. Initialize and print all elements of a 2D array.*/
public class Program1 
{

	public static void main(String[] args) 
	{
		//Method 1:
		int a[][]= {{1,2,3,4,5,6,7},{9,8,7,6,5,4,3}};
		
		System.out.println("Display 1 array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		
		//Method 2:
		int c[][]=new int[][] {{9,8},{7,6,5,4},{3,2,1}};
		
		System.out.println("Display 2 array:");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print (c[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
