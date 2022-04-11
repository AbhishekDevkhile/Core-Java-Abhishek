package JavaTest4;

public class FindMaxInRowwise 
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
