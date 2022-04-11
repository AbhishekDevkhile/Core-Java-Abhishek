package day2;

import java.util.Scanner;

public class if_else_vowlesORnot {

	public static void main(String[] args) {

		System.out.println("Check Char. Vowles or not.");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		//char a,e,i,o,u;
		/*
		if(ch =='a' ||ch=='e' || ch=='i' ||ch=='o' || ch=='u')
		{
			System.out.println("Given input is vowles");
			
		}
		else
		{
			System.out.println("Given input is consonants");
		}
		*/
		
		if(ch =='a')
			System.out.println("Given input is vowles");
		else if(ch=='e')
			System.out.println("Given input is vowles");
		else if(ch =='i')
			System.out.println("Given input is vowles");
		else if(ch=='o')
			System.out.println("Given input is vowles");
		else if(ch =='u')
			System.out.println("Given input is vowles");
		else
			System.out.println("Given input is consonants");

	}

}
