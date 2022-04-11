package day7_Array;

import java.util.Scanner;

public class FindAverage {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int sum=0;
		int avg;
		System.out.println("Enter element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		avg=sum/arr.length;
		System.out.println(avg);
		

	}

}
