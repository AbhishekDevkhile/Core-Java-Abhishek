package Day8_2DArray;
/*10. WAP to print minimum in columns
E.g. arr[][]={{22, 31, 9}, {12, 5,16}, {34, 42, 2}}
Output is - 12, 5, and 2.*/
public class Program10 
{

	public static void main(String[] args) 
	{
		int a[][]={{22, 31, 9}, {12, 5,16}, {34, 42, 2}};
		System.out.println("Array elements are:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print (a[i][j]+"  ");
			}
			System.out.println();
		}
		
		int min=0;
		for(int i=0;i<a.length;i++)
		{
			min=a[0][i];
			 
				for (int j = 0; j < a[i].length; j++) 
				{ 
	                if (a[j][i] < min) 
	                { 
	                    min = a[j][i]; 
	                } 
	            } 
				System.out.println(min);	
		}
		

	}

}
