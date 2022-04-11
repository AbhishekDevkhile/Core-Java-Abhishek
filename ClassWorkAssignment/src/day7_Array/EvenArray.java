package day7_Array;

import java.util.Scanner;

public class EvenArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size=sc.nextInt();
		System.out.println("Enter element: ");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Even elements: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
		}
	}

}
