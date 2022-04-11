package day3;

import java.util.Scanner;

public class Check_Disarium_or_not 
{

	public static void main(String[] args) 
	{
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
			int n=sc.nextInt();
			int temp=n;
			int count=0;
			
		/*	while(n>0)
			{
				
				n=n/10;
				count++;
			}
			System.out.println(count);
			
			n=temp;
			int sum=0;
			while(n>0)
			{
				int r=n%10;
				int pow=(int) Math.pow(r, count);
				sum=sum+pow;
				count--;
				n=n/10;
			}
			
			System.out.println(sum);
			n=temp;
			if(sum==n)
			{
				System.out.println("Disarium");
			}
			else
			{
				System.out.println("not");
			*/
			
			
			
			while(n>0)
			{
				
				n=n/10;
				count++;
			}
			System.out.println("Number of count: "+count);
			
			n=temp;
			int sum=0;
			while(n>0)
			{
				int r=n%10;
				int pow = 1;
				int exp=1;
					while(exp <=count)
						{
					       pow = pow * r;
					       exp++;
						}
					
				/*
				  	for( ; exp<=count ;exp++)
						{
							pow = pow*r;
						}
			     */
					
				sum = sum + pow;
				n=n/10;
				count--;
			}
			
			System.out.println("Print Sum is : "+sum);
			n=temp;
			
			if(sum==n)
			{
				System.out.println("Given num is Disarium");
			}
			else
			{
				System.out.println("Given num is not a Disarium");
			
			
		}

	}


}


