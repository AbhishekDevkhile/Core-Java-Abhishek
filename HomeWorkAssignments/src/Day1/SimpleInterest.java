package Day1;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		System.out.println("Calculate Simple Interest");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Principal Amount value : ");
		int amount = sc.nextInt();
		
		System.out.println("Enter the Rate :- ");
		int rate = sc.nextInt();
		
		System.out.println("Enter the time :- ");
		int time = sc.nextInt();
		
		double simple_interest = (amount * rate * time)/100;
		System.out.println("Simple Interest value = " +simple_interest); 
	}

}
