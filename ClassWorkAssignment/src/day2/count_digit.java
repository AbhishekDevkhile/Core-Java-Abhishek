package day2;

import java.util.Scanner;

public class count_digit {

	public static void main(String[] args) 
	{
		System.out.println("Count digit using while loop");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input: ");
		int no =sc.nextInt(); 
		
		//int no = 12345;
		int count = 0,rem;
		
		while(no != 0)
		{
			rem=no%10;
			count=count + 1;
			no=no/10;
			
		}
		System.out.println(" " +count);
		
		
		System.out.println();
		System.out.println();
		
		
		
       System.out.println("Count of digit using for loop");
		
		System.out.print("Enter input: ");
		int no1 =sc.nextInt(); //initialization loop
		int count1 = 0,rem1;
		
		for(  ; no1 > 0; )
		{
			rem1=no1%10;
			count1=count1 + 1;
			no1=no1/10;       //re-increment loop
		}
		System.out.println(" " +count1);
	}

}
