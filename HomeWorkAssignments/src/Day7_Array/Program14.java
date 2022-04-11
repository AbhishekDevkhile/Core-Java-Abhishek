package Day7_Array;
/*14. Write a java program to separate zeros from non-zeros in an 
 integer array?
Input Array - [12, 0, 7, 0, 8, 0, 3]
Input Array After moving zeros to end - [12, 7, 8, 3, 0, 0, 0]*/
public class Program14 
{

	public static void main(String[] args) 
	{
		int[] a= {12, 0, 7, 0, 8, 0, 3};
		
		int j=0;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)                  //logic if a[i] != 0 then swapping 
			{
				if(i!=j)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				j++;
				
			}
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}

	}

}
