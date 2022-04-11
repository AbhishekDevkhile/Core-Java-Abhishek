
package day3;

import java.util.Scanner;

public class Numberfrq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		
		int n=sc.nextInt();
		int count=0;
		int m=n;
		
		for(int i=0;i<=9;i++)
		{
			count=0;
			while(n>0)
			{
			int d=n%10;
			if(i==d)
			{
				count++;
			}
			n=n/10;
			}
			if(count>0)
			{
			System.out.println(i+" "+count);
			}
			
			
			n=m;
			
		}
		
		
		
		
		
		
	}
	

}
