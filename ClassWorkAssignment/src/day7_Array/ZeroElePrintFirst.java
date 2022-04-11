package day7_Array;
/*print all zero element in start of array*/
import java.util.Scanner;

public class ZeroElePrintFirst {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size=sc.nextInt();
		System.out.println("Enter element: ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int j=0;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{

				if(a[i]==0 )                 //logic if a[i]==0 then swapping 
				{
					if(i!=j)              //index position not equal condition
					{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
					j++;
			
				}
			
			//System.out.println(a[i]);
		}
		
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
		
		
		
	}

}
