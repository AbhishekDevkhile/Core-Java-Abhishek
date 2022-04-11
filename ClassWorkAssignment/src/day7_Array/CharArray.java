 package day7_Array;

import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Char array size:");
		int size=sc.nextInt();
		
		char s[]=new char[size];
		System.out.println("Enter value: ");
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.next().charAt(0);
		}
		
		System.out.println("Elements are: ");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
