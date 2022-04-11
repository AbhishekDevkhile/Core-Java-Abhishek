package Day7_Array;

import java.util.Scanner;

/*8. WAP to find the maximum and minimum value in an array.*/
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size=sc.nextInt();
		System.out.println("Enter element: ");
		int a[]=new int[size];
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		/*
		int max=a[0];
		int min=a[0];
		for(int i=0;i<=a.length;i++)
	       {
	         
	         if(a[i]<min)
	         {
	        	 min=a[i];
	         }
	         if(a[i]>max)
	         {
	           max=a[i];
	         }
	       }
	       System.out.println("Maximum element is "+max);
	       System.out.println("Minimum element is "+min);
         */
		
		System.out.println("//////////OR/////////////");
		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Maximum no :"+a[a.length-1]);
		System.out.println("Minimum no :"+a[0]);
	}

}
