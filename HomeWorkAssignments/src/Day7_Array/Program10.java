package Day7_Array;
/*10. Write methods that return the average of an array with following headers 
 and invoke the method from main 
 1)public static int average(int[] array).*/

import java.util.Scanner;



public class Program10 
{
	
	public static int average(int[] a) 
	{
		int sum=0;
		int avg=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/a.length;
		
		return avg;
	}
	


	public static void main(String[] args) 
	{
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println(average(a));

		

	}

	
		
	}


