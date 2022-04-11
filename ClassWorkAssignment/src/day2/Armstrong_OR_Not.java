
package day2;

import java.util.Scanner;

public class Armstrong_OR_Not {

	public static void main(String[] args) 
	{
      System.out.println("Using for loop print given num is Armstrong or not");
      Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input:");
		int no = sc.nextInt();		
        int rem;
		int sum = 0;
		//int no=123;
		int no1 = no;
		
		for( ;no != 0;)
		{
			rem=no % 10;
			sum=sum + (rem*rem*rem);
			no=no/10;
		}
			System.out.println(no1+ " " +sum);
		if(sum != no1)
		{
			System.out.println(" Not a Armstrong no.");
		}
		else
		{
			System.out.println("Armstrong no");
		}

		
		System.out.println();
		System.out.println();
		
		 System.out.println("Using While loop print given num is Armstrong or not");
	   		
			System.out.println("Enter input:");
			int num = sc.nextInt();
			  int rem1;
				int sum1 = 0;
				//int no=123;
				int no2 = num;
				
				while(num != 0)
				{
					rem1=num % 10;
					sum1=sum1 + (rem1*rem1*rem1);
					num=num/10;
				}
					System.out.println(no2+ " " +sum1);
				if(sum1 != no2)
				{
					System.out.println(" Not a Armstrong no.");
				}
				else
				{
					System.out.println("Armstrong no");
				}
		
		
		
	}

}
