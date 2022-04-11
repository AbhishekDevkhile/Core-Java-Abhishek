package JavaTest4;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter element on array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Number of odd numbers::");
		int count1=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 != 0)
			{
				System.out.print(a[i]+"  ");
				count1++;
			}
		}	
		System.out.println("   =>Count of Odd num:"+count1);
		
		System.out.println("//////////////////////////////////////////////");
		
		System.out.println("Number of Even numbers::");
		int count2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.print(a[i]+"  ");
				count2++;
			}
		}	
		System.out.println("   =>Count of Even num:"+count2);

	}

}
