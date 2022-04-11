package Day2;
import java.util.Scanner;

public class if_else_MaxNo {

	public static void main(String[] args) {
		System.out.println("Print maximum no. out of three.");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter first no:");
		int num1 =sc.nextInt();
		
		System.out.print("Enter Second no:");
		int num2 =sc.nextInt();
		
		/*
		if(num1 > num2)
			System.out.println("num1 > num2");
		else
			System.out.println("num2>num1");
		*/
		
		
		
		/*-----System.out.println("Using if_else ladder ,find max no.");-----*/
		/*
		System.out.println("Enter third no:");
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3)
			System.out.println("num1 is greater than other nos.");
		else if(num2>num1 && num2>num3)
			System.out.println("num2 is greater than other nos.");
		else
			System.out.println("num3 is greater than other nos.");
		*/
		
		
		/*-----System.out.println("Using If_else nested loop, find max no.");-----*/
		
		System.out.print("Enter third no:");
		int num3 = sc.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
				System.out.println("num1 is greater no ");
			else
				System.out.println("num3 is greater no.");
		}
		else
		{
			if(num2>num3)
				System.out.println("num2 is greater no.");
			else
				System.out.println("num3 is greater no.");
		}
		
			
	}

}
