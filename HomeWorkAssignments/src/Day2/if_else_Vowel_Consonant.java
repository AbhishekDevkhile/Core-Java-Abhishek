package Day2;

import java.util.Scanner;

public class if_else_Vowel_Consonant {

	public static void main(String[] args) {
	
		System.out.println("Check Vowels or Consonant.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Alphabet:");
		char ch = sc.next().charAt(0);
	
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
		
		/*
		if((ch =='a' ||ch=='e' || ch=='i' ||ch=='o' || ch=='u')&&(ch =='A' ||ch=='E' || ch=='I' ||ch=='O' || ch=='U'))
		{
			System.out.println("Given input is vowles");
	
		}
	else
		{
				System.out.println("Given input is consonants");
		}
		*/
		
		System.out.println("Using Switch case method.");
		
		switch (ch) 
		{
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        	
        	System.out.println(" Given input is vowles");
        		break;
        default:
            System.out.println(" Given input is consonants");
		}
	}

}
