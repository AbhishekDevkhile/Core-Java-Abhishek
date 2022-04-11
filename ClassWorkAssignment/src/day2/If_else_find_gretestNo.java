package day2;

import java.util.Scanner;

public class If_else_find_gretestNo {

	public static void main(String[] args) {
		System.out.println("Print gretest no.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First value : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second value : ");
		int num2 = sc.nextInt();
		System.out.println("Enter Second value : ");
		int num3 = sc.nextInt();
		

		/*
		if(num1>num2 &&num1>num3) 
		
			System.out.println("num1 is greatest no.");
		
		else if(num2>num3 && num2>num1)
			
			System.out.println("num2 is greatest no.");
		
		else
			
			System.out.println("Num3 is Greatest no.");
		*/
		
		
		System.out.println("Using nested loop");
		if(num1>num2)
		{
	
			if(num1>num3)
				System.out.println("num 1 >");
			else
				System.out.println("num3 is >");
			
		}
		else
		{
			if(num2>num3)
				System.out.println("num2 is >");
			else 
				System.out.println("num3 is >");
		}
	
	
	}

}
