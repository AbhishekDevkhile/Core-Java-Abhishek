package Diwalispecial;

import java.util.Scanner;

/*Write a program to print all factors of given numbers.*/
public class Program1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		System.out.println("Factor of "+num+"are :");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
