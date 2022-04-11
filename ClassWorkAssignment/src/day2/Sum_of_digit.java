package day2;

import java.util.Scanner;

public class Sum_of_digit {

	public static void main(String[] args) {
		System.out.println("Find sum of digit using while loop");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input: ");
		int no =sc.nextInt(); 
		
		//int no =1234;
		int rem;
		int add =0;
		
		
		while(no != 0)
		{
			rem=no%10;
			add=add + rem;
			no=no/10;
		}
			System.out.println("" +add);
	
	
	
	System.out.println();
	System.out.println();
	
	System.out.println("Find sum of digit using for loop");

	System.out.print("Enter input: ");
	int no1 =sc.nextInt();            //loop initialization
	  int cnt1 = 0,rem1;
	  
		for(   ; no1>0 ;  )
			
		{
		  rem1 =no1%10;
		  cnt1 = cnt1 + rem1;
		  no1 = no1 / 10;              // loop increment
		 
			
		}
	     System.out.println("" +cnt1);

	}
	

}
