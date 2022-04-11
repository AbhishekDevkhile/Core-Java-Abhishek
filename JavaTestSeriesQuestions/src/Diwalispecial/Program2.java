package Diwalispecial;

import java.util.Scanner;

/*2.	A number is said to be the Harshad number if it is divisible by the sum of      its digit.For example, if number is 156, then sum of its digit will be 1 + 5 + 6 = . Since156 is divisible by 12. So, 156 is a Harshad number.
Some of the other examples of Harshad number are 8, 54, 120, etc.
To find whether the given number is a Harshad number or not, calculate the sum of the digit of the number then, check whether the given number is divisible by the sum of its digit. If yes, then given number is a Harshad number.
2.	A number is said to be the Harshad number if it is divisible by the sum of      its digit.For example, if number is 156, then sum of its digit will be 1 + 5 + 6 = . Since156 is divisible by 12. So, 156 is a Harshad number.
Some of the other examples of Harshad number are 8, 54, 120, etc.
To find whether the given number is a Harshad number or not, calculate the sum of the digit of the number then, check whether the given number is divisible by the sum of its digit. If yes, then given number is a Harshad number.
*/
public class Program2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int num=sc.nextInt();
		
		
		int x=num;
		int rem;
		int sum=0;
		while(x!=0)
		{
			rem=x%10;
			sum=sum+rem;
			x=x/10;
		}
		System.out.println("Given number is:"+num);
		System.out.println("Sum og digit of number is:"+sum);
		
		if(num%sum==0)
		{
			System.out.println("it is a Harshed Number.");
		}
		else
		{
			System.out.println("not a Harshed number.");
		}

	}

}

