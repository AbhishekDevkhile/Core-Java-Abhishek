package day2;

import java.util.Scanner;

public class If_else_OddEven 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Print odd Even nos.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input : ");
		int num = sc.nextInt();
		
		if(num%2==0)
			System.out.println("Input is Even");
		else
			System.out.println("Input is Odd");
		
	}

}
