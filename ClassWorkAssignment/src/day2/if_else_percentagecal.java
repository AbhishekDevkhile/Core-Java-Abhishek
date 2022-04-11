package day2;

import java.util.Scanner;

public class if_else_percentagecal {

	public static void main(String[] args) {
		System.out.println("Find percentage value and calculate grade.");
		
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Enter 1st Subject marks:- ");
		int sub1 = sc.nextInt();
		System.out.println("Enter 2st Subject marks:- ");
		int sub2 = sc.nextInt();
		System.out.println("Enter 3st Subject marks:- ");
		int sub3 = sc.nextInt();
		
		int sum = sub1 + sub2 + sub3 ;
		int per = (sum*100)/300;
		System.out.println("Percentage = " + per +"%");
		
		if(per>=60 && per<70) 
		{
			System.out.println("Grade:-First Class");
			
		}
		else if(per>50 && per<60) 
		{
			System.out.println("Grade:-Second Class");
			
		}
		else if(per>=35 && per<50) 
		{
			System.out.println("Grade:-Third Class");
			
		}
		else if(per>= 70 && per<100) 
		{
			System.out.println("Grade:-Destinaction");
			
		}
		else if(per>=0 && per<35)
		{
			System.out.println("failed");
		}
		else
		{
			System.out.println("invalid input");
			
		}

	}

}
