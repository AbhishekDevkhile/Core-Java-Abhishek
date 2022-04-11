package day8_PatternsInArray;

import java.util.Scanner;

/*Print outer box pattern in array*/
public class BoxPattern {

	public static void main(String[] args) {
		
		int[][] a=new int[][]{{1,2,3,4},{5,6,7,8},{9,8,7,6},{5,4,3,2}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==0  || j==0 || i==a.length-1 || j==a.length-1)
				{
					System.out.print(a[i][j]); 
					
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
