package day2;

import java.util.Scanner;

public class if_else_positive_Negative 
{

	public static void main(String[] args) 
	{
		System.out.println("Print no. is +ve or -ve.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input : ");
		int num = sc.nextInt();
			
		if(num>0)
			System.out.println("Number is +ve.");
		
		else if(num<0)
			System.out.println("Number is -ve.");
		
		else
			System.out.println("Number is equal to zero");
	}

}
