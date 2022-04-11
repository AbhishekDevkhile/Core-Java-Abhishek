package day2;

import java.util.Scanner;

public class Reverse_no {

	public static void main(String[] args) {
        System.out.println("Print reverse nos.");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Print reverse nos. using while loop");
		System.out.println("Enter input:");
		int no = sc.nextInt();
		
		//int no=1221;
		int rem;
		int rev=0;

		
		
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
			System.out.println(rev);
			
			
			System.out.println();
			System.out.println();
			
			

	}

}
