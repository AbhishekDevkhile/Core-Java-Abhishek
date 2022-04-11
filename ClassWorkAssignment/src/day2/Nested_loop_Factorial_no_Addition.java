package day2;

import java.util.Scanner;

public class Nested_loop_Factorial_no_Addition {

	public static void main(String[] args) {
		System.out.println("Using nested for loop print Addition of Factorial no");	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input:");
		int no = sc.nextInt();
		//int no =5;
		
		int sum = 0;
		
		for(int i=1;i<=no;i++)
		{
			int fact = 1;
			for(int j=1;j<=i;j++) 
			{
				fact = fact * j;
				
			}
			sum = fact + sum;
		}
		
		System.out.println(" "+sum);
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Using nested for loop print Addition of Factorial no");	
		
		System.out.println("Enter input:");
		int no1 = sc.nextInt();
		
		int sum1 = 0;
		int k = 1;
		while(k<=no1)
		{
			int fact1 = 1;
			int l =1; 
			while(l<=k) 
			{
				fact1 = fact1 * l;
				l++;
				
			}
			sum1 = fact1 + sum1;
			k++;
		}
		
		System.out.println(" "+sum1);
		

	}

}
