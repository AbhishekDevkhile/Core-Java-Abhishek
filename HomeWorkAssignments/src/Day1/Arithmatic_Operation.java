package Day1;
import java.util.Scanner;

public class Arithmatic_Operation {

	public static void main(String[] args) {
		System.out.println("Arithmatic  Operations");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First value : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second value : ");
		int num2 = sc.nextInt();
		
		System.out.println("Addition:-");
		int addition = num1 +num2;
		System.out.println("Addition is =" +addition); 
		
		System.out.println("Subtraction:-");
		int subtract = num1 - num2;
		System.out.println("Subtraction is =" +subtract);
		
		System.out.println("Multiplication:-");
		int multiply = num1 * num2;
		System.out.println("Multiplication is =" +multiply);
		
		System.out.println("Devision:-");
		int devision = num1 / num2;
		System.out.println("Devision is =" +devision);
		
		System.out.println("Modules:-");
		int mod = num1 +num2;
		System.out.println("Modules is =" +mod);
		
		System.out.println("Increment");
		int Incr = num1;
		System.out.println("Increment is =" + ++Incr); 
		
		System.out.println("Decrement");
		int Decr = num1;
		System.out.println("Decrement is =" + --Decr);
		
		
	}

}
