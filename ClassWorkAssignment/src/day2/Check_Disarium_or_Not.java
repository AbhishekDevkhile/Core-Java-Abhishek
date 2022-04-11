package day2;

import java.util.Scanner;

public class Check_Disarium_or_Not {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input:");
		int num = sc.nextInt();*/
		int num = 175;
		int temp = num;
		int rem;
		int sum = 0 ;
		int j = 1;
		  
		
		while(temp!=0)
		{
			 
			rem = temp %10;
			sum = sum*10+rem;
			temp = temp /10;
			System.out.println(temp);
		}
		
		temp = sum;
		sum = 0;
		while(temp !=0) 
		{
			rem=temp%10;
			sum=sum+(int)Math.pow(rem,j);
			temp = temp/10;
			j++;
			
		}
		
		if(sum != num )
		{
			System.out.println(" Not a Disarium no.");
		}
		else
		{
			System.out.println("Disarium no");
		}
		
		
		
	}

}
