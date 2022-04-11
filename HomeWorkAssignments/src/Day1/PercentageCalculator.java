package Day1;
import java.util.Scanner;

public class PercentageCalculator {

	public static void main(String[] args) 
	{
		System.out.println("Calculate Percentage ");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Five subjet Marks out of Hunderds : ");
		System.out.print("Enter First Subjet mark:-");
	    int num1 = sc.nextInt();
	    //System.out.println(" " +num1);
	    
	    System.out.print("Enter Second Subjet mark:-");
	    int num2 = sc.nextInt();
	    //System.out.println(" " +num2);
	    
	    System.out.print("Enter Third Subjet mark:-");
	    int num3 = sc.nextInt();
	   // System.out.println(" " +num3);
	    
	    System.out.print("Enter Fourth Subjet mark:-");
	    int num4 = sc.nextInt();
	   // System.out.println(" " +num4);
	    
	    System.out.print("Enter Fifth Subjet mark:-");
	    int num5 = sc.nextInt();
	    //System.out.println(" " +num5);
	    
	    int Total = num1 + num2 + num3 + num4 + num5;
	    System.out.println("Total is = " +Total);
	    
	    float Percentage = Total *100 / 500;
	    System.out.print("Percentage is = " +Percentage+"%");
	    
	}

}
