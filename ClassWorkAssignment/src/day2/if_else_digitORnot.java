package day2;

import java.util.Scanner;

public class if_else_digitORnot {

	public static void main(String[] args) {
		System.out.println("Enter input");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
	
		if((ch>='a' && ch<= 'z')  || (ch>='A' && ch<= 'Z') )
			System.out.println("Input is char format");
		else if(ch>='0' && ch<='9')
			System.out.println("input is number format");
		else
			System.out.println("invalid");
		
	
	}

}
