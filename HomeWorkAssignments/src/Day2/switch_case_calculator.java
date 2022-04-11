package Day2;

import java.util.Scanner;

public class switch_case_calculator {

	public static void main(String[] args) {
		System.out.println("Calculator using Switch case");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter num2:");
		int num2 = sc.nextInt();
		
		System.out.print("Enter choice: 1.Add 2.Subtract 3.Multiply 4.Divide 5.Mod");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Addition is=" +(num1+num2));
			break;
		case 2:
			System.out.println("Suntraction is=" +(num1-num2));
			break;
		case 3:	
			System.out.println("Multipilcation is=" +(num1*num2));
			break;
		case 4:
			System.out.println("Division is=" +(num1/num2));
			break;
		case 5:
			System.out.println("Modules is=" +(num1%num2));
			break;
		default:
			System.out.println("Invalid Choice");
		}
		

	}

}
