package Day7_Array;

import java.util.Scanner;

/*11. WAP to arrange the elements of an given array of integers where all negative 
  integers appear before all the positive integers.*/
public class Program11 {

	public static void main(String[] args) 
	{/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		
		int[] a =new int[size];
		
		System.out.println("Enter array Elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		*/
		int[] a= {5,4,3,2,1,0,-1,-2,-3,-6,8,9};
		for(int i=0;i<a.length;i++)
		{
			int temp=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j] && i !=j )
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Arrange all negative integers appear before all the positive integers::");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}

	}

}
