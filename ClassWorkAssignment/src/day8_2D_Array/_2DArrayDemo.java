package day8_2D_Array;
/*2 D Array display with all possible ways */
public class _2DArrayDemo {

	public static void main(String[] args) 
	{
// Method 1 :
		int[][] a=new int[2][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		
		
	/*	System.out.println("Display array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print (a[i][j]+"  ");
			}
			System.out.println();
		}
	      */  
							//OR
		System.out.println("Display using for-each loop array:");
		for(int[] z:a)
		{
			for(int y:z )
			{
				System.out.print(y+"  ");
			}
			System.out.println();
		}
		
		//Method 2:
		
		int b[][]= {{1,2},{3,4,5},{6,7,8}};
		
	/*	System.out.println("Display array:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print (b[i][j]+"  ");
			}
			System.out.println();
		*/
		             //OR
		System.out.println("Display using for-each loop array:");
		for(int[] z:b)
		{
			for(int y:z )
			{
				System.out.print(y +"  ");
			}
			System.out.println();
		}
		
		/*//Method 3:
		int c[][]=new int[][] {{9,8},{7,6,5,4},{3,2,1}};
		
		System.out.println("Display array:");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print (c[i][j]+"  ");
			}
			System.out.println();
		}
		*/
/*
//		Method 4:Jagged array
			int[][] a=new int[2][];
			a[0]=new int[3];
			a[1]=new int[2];
			a[2]=new int[4];
*/
	}

}
