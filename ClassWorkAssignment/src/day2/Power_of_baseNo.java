package day2;

import java.util.Scanner;

public class Power_of_baseNo {

	public static void main(String[] args) {
		System.out.println("find Power of base using while loop");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter base no:");
		int base = sc.nextInt();
		
		System.out.println("Enter Exponent No: ");
		int exp = sc.nextInt();
		int ans=1;
		while(exp != 0)
		{
			 ans = ans * base ;
			 exp--;
		}
         System.out.println("Answer = " +ans);

		
         System.out.println();
         System.out.println();
         
         System.out.println("find Power of base using while loop");
 				
 		System.out.println("Enter base no:");
 		int base1 = sc.nextInt();
 		
 		System.out.println("Enter Exponent No: ");
 		int exp1 = sc.nextInt();
 		int ans1=1;
 		
 		for(  ; exp1 > 0 ; exp1--)
 		{
 			ans1 = ans1 * base1;
 		}
         System.out.println("Answer = " +ans1);
         

	}

}
