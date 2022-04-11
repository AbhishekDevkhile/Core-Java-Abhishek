package day2;

import java.util.Scanner;

public class if_else_GretestNo {

	public static void main(String[] args) {
		System.out.println("Print gretest no. btw to nos.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First value : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second value : ");
		int num2 = sc.nextInt();
		
		
		if(num1>num2)
			System.out.println("Num1 is Greater than Num2.");
		else
			System.out.println("Num2 is greater than num1");

	}

}
