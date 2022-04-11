package Diwalispecial;
/*Write a code to initialize 2D array  like this
0 1 0 1 
1 0 1 0 
0 1 0 1 
1 0 1 0
*/

public class Program5 
{

	public static void main(String[] args) 
	{
		int arr[][]=new int[4][4];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i%2==0)
				{
					if(j%2==0)
					{
						arr[i][j]=0;
					}
					else
					{
						arr[i][j]=1;
					}	
					
				}
				else
				{
					if(j%2==0)
					{
						arr[i][j]=1;
					}
					else
					{
						arr[i][j]=0;
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
