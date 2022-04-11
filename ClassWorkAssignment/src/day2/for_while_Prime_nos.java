package day2;

import java.util.Scanner;

public class for_while_Prime_nos {

	public static void main(String[] args) 
	{
		
		System.out.println("Using for loop Print prime no. or Not ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input:");
		int num = sc.nextInt();
		int count=0;
	
		 
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		if(count==0)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}

		
		System.out.println();
		System.out.println();
		
		System.out.println("Using while loop Print prime no. or Not ");
		
		int i=2;
		while(i<num)
		{
			if(num%i==0)
			{
				count++;
			}
				i++;
		}
		if(count==0)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println(" Not a Prime Number");
		}
	}

}
