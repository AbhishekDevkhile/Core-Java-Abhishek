package day2;

import java.util.Scanner;

public class For_while_factorial_no {

	public static void main(String[] args) 
	{
		System.out.println("Using for loop print factorial");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input:");
		int num = sc.nextInt();
	    int fact=1;
	    
	    
		for(int i=1;i<=num;i++)
		{
			fact=fact*i; 
		}
			System.out.println(" "+fact);
			
			
			
			System.out.println();
			System.out.println();
			
		System.out.println("Using while loop Print factorial nos. ");
		
		System.out.println("Enter input:");
		int num1 = sc.nextInt();
	    int fact1=1;
	    int j=1;
	    
	    while(j<=num1)
	    {
	    	fact1=fact1*j;
	    	j++;
	    }
	    System.out.println(" " +fact1);
	}

}
