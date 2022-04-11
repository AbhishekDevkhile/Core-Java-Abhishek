
package day7_Array;

import java.util.Scanner;

public class ReversePosition {

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
		
		/*System.out.println("Print in reverse order: ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		*/
		
		System.out.println("Print in reverse position: ");
		
		int j=a.length-1;
		
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
		
		

	}

}
