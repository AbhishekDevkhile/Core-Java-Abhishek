package Day2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Display Fibonacci series ");
		
		System.out.println("Enter upto value:");
		int num=sc.nextInt();
		
		int a=0;
		int b=1;
		System.out.print(a+ " "+b);
		int c;
		
		for(int i=1;i<=num;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
		
		System.out.println();
		System.out.println("Enter upto value:");
		int num1=sc.nextInt();
		int d=0;
		int e=1;
		System.out.print(d+" "+e);
		int i=0,f;
		while(i<=num1)
		{
			f=d+e;
			System.out.print(" "+f);
			i++;
			d=e;
			e=f;
			//i++;
		}
	}

}
