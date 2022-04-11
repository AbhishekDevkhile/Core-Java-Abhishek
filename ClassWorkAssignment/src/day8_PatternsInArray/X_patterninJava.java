package day8_PatternsInArray;

public class X_patterninJava {

	public static void main(String[] args) {

		int[][] a=new int[][]{{1,2,3,4},{5,6,7,8},{9,8,7,6},{5,4,3,2}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if( i==j || i+j==a[i].length-1)
					System.out.print(a[i][j]);
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
