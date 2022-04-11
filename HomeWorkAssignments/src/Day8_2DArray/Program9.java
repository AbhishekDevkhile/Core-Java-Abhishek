package Day8_2DArray;
/*9. WAP to print maximum in row
E.g. arr[][] ={{22, 31, 9}, {12, 25, 16}} output is - 31 and 25.*/
public class Program9 
{

	public static void main(String[] args)
	{
	int a[][]= {{22,31,9},{12,25,16}};
		
		for(int i=0;i<a.length;i++)
		{
			int max=0; 
				for (int j = 0; j < a[i].length; j++) 
				{ 
	                if (a[i][j] > max) 
	                { 
	                    max = a[i][j]; 
	                } 
	            } 
				System.out.println(max);
		}
	

	}

}
