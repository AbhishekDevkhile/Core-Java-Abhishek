package Day7_Array;

import java.util.Scanner;

/*4. Take 20 integer inputs from user and print the following: 1.number of positive 
  numbers 2.number of negative numbers 4.number of odd numbers 5.number of even numbers 
  6.number of 0s.*/
public class Program4 {

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
    
		System.out.println("//////////////////////////////////////////////");
		
		System.out.println("number of Positive numbers::");
		int count1=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				System.out.print(a[i]+"  ");
				count1++;
			}
		}	
		System.out.println("   =>Count of positive num:"+count1);
		
		System.out.println("//////////////////////////////////////////////");
		
		System.out.println("number of Negative numbers::");
		int count2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.print(a[i]+"  ");
				count2++;
			}
		}	
		System.out.println("   =>Count of negative num:"+count2);	
			
		System.out.println("//////////////////////////////////////////////");
		
		System.out.println("Number of odd numbers::");
		int count3=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 != 0)
			{
				System.out.print(a[i]+"  ");
				count3++;
			}
		}	
		System.out.println("   =>Count of Odd num:"+count3);
		
		System.out.println("//////////////////////////////////////////////");
		
		System.out.println("Number of Even numbers::");
		int count4=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.print(a[i]+"  ");
				count4++;
			}
		}	
		System.out.println("   =>Count of Even num:"+count4);
		
		System.out.println("//////////////////////////////////////////////");
		
		System.out.println("print 0 numbers::");
		int count5=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == 0)
			{
				System.out.print(a[i]+"  ");
				count5++;
			}
		}	
		System.out.println("   =>Count of Zero num:"+count5);
		
		}
	}
