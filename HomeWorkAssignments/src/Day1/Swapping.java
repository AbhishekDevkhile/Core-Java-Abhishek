package Day1;
import java.util.Scanner;


public class Swapping {

	public static void main(String[] args) 
	{
		System.out.println("Swapping of two numbers using third variable :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First value : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second value :  ");
		int num2 = sc.nextInt();
		int temp=0;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swapping values of a is : " +num1);
		System.out.println("After Swapping values of b is : " +num2);
		
		
		System.out.println("************************************************************************");
		System.out.println("************************************************************************");
		
		
		System.out.println("Swapping of two numbers without using third variable :");
		System.out.println("Enter Third  value : ");
		int num3 = sc.nextInt();
		System.out.println("Enter Fourth value :  ");
		int num4 = sc.nextInt();
		
		num3 = num3 + num4;
		num4 = num3 - num4;
		num3 = num3 - num4;
		
		System.out.println("After Swapping values of a is : " +num3);
		System.out.println("After Swapping values of b is : " +num4);
		
		
	}

}
