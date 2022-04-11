package day2;

import java.util.Scanner;

public class For_while_Print_Table {

	public static void main(String[] args) {
		
		System.out.println("Print table using For loop.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No:");
		int num = sc.nextInt();
		int table=0;
		
		for(int i=1;i<=10;i++)
		{
			table = num * i;
			System.out.println(table);
		}
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Print table using While loop.");
		
		
		System.out.print("Enter No:");
		int num1 = sc.nextInt();
		int table1=0;
		int j=1;
		while(j<=10)
		{
			table1 = num1 * j;
			System.out.println(table1);
			j++;
		}
	
	}

}
