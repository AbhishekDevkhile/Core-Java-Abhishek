package day1;
import java.util.Scanner;


public class ArithmaticOperation {

	public static void main(String[] args) {
		System.out.println("Arithmatic Operators");
		Scanner sc = new Scanner(System.in);
	 //int a=30,b=36;
		 
		 
		 System.out.println("Enter 1 value =");
	     int a = sc.nextInt();
	     System.out.println("Enter 2 value =");
	     int b = sc.nextInt();
	     
		 System.out.println("Use + operator");
		 int Addition = a + b;
		 System.out.println("Answer is = " +Addition);
		 System.out.println("Use - operator");
		 int Subtraction = a - b;
		 System.out.println("Answer is = " +Subtraction);
		 System.out.println("Use / operator");
		 int Division = a / b;
		 System.out.println("Answer is = " +Division);
		 System.out.println("Use * operator");
		 int Multiplication = a * b;
		 System.out.println("Answer is = " +Multiplication);
		 System.out.println("Use % operator");
		 int Module = a % b;
		 System.out.println("Answer is = " +Module);
		

	}

}
