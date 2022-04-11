 package day2;

import java.util.Scanner;

public class Palindrome_Or_not {

	public static void main(String[] args) {
	     System.out.println("Print reverse nos.");
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Print reverse nos. using while loop");
			System.out.println("Enter input:");
			int no = sc.nextInt();
			int no1 = no;
			//int no=1221;
			int rem;
			int rev=0;

			
			
			while(no!=0)
			{
				rem=no%10;
				rev=rev*10+rem;
				
				no=no/10;
			}
			
				
			
			if(rev != no1)
			{
				System.out.println("Given input Not a palindrome");
			}
			else
			{
				System.out.println("Given input is palindrome" );
			}
			
		   System.out.println(rev);

	}

}
