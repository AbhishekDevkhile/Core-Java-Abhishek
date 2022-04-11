package Day2;

import java.util.Scanner;

public class switch_Display_day {

	public static void main(String[] args) {
		System.out.println("Display days using Switch case.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Choice between 1 to 7.");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		  case 1:
				System.out.println("Monday" );
				break;
		  case 2:
				System.out.println("Tuesday" );
				break;
		  case 3:
				System.out.println("Wednesday" );
				break;
		  case 4:
				System.out.println("Thursday" );
				break;
		  case 5:
				System.out.println("Friday" );
				break;
		  case 6:
				System.out.println("Saturday" );
				break;
		  case 7:
				System.out.println("Sunday" );
				break;
		  default:
				System.out.println("error, day does not exist.");
		}
	}

}
