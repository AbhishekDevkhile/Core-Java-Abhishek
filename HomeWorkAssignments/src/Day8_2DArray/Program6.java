package Day8_2DArray;
/*6. WAP to find sum of main diagonal elements of a matrix.*/
public class Program6 
{

	public static void main(String[] args) 
	{
		int[][] a=new int[][]{{1,2,3,4},{5,6,7,8},{9,8,7,6},{5,4,3,2}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}	
		}
		System.out.println("SUM of DIAGONAL elements of the matrix = "+sum);
		

	}

}
