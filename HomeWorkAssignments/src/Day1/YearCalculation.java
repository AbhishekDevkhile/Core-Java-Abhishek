package Day1;
import java.util.Scanner;


public class YearCalculation {

	public static void main(String[] args) {
		System.out.println("Convert days into years, weeks and days");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of days : ");
		int days = sc.nextInt();
		
	    int Year = days/365;
	    days = days % 365;
		System.out.println("Years = " +Year);
		
		int week = days/7;
		days = days % 7;
		System.out.println("Weeks = " +week);
		
		int day = days;
		System.out.println("Days = " +day);
		
	
	}

}
