package day2;

import java.util.Scanner;

public class Nested_loop_table_Print_1_5_table {

	public static void main(String[] args) {

		System.out.println("Using nested For loop print table");
  
	Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No:");
		int num = sc.nextInt();
		int table=0;
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=10;j++) 
			{
				table = j * i;
				System.out.print("  " +table);
		    }
		      System.out.println();
	   }
		
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Using nested while loop print table");
		System.out.print("Enter No:");
		int num1 = sc.nextInt();
		int table1=0;
		int k =1 ;
		
		while(k <= num1)
		{
			int l=1;
			while(l<=10)
			{
				
				table1 = k * l;
				System.out.print("  " +table1);
				l++;
			}
			System.out.println();
			k++;
		}

}
}