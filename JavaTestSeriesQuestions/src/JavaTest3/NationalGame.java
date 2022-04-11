package JavaTest3;

import java.util.Scanner;

public class NationalGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.India 2.China 3.Bangladesh 4.Itlay 5.US");
		System.out.println("Enter input::");
		int no=sc.nextInt();
		
		switch(no)
		{
		case 1:
			System.out.println("Hockey");
			break;
		case 2:
			System.out.println("Table Tennis");
			break;
		case 3:
			System.out.println("Kabaddi");
			break;
		case 4:
			System.out.println("Football");
			break;
		case 5:
			System.out.println("Baseball");
			break;
		default:
			System.out.println("Invalid");
		}

	}

}
