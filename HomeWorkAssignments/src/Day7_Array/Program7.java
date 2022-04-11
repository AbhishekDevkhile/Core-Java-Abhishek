package Day7_Array;

import java.util.Scanner;

/*Write a program to check if elements of an array are same or not it 
  read from front or back. in java.E.g.- {2,3,15,15,3,2}.*/
public class Program7 {

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
		int j=a.length-1;
		boolean issame=true;
		for(int i=0;i<a.length/2;i++)
		{
			if(a[i] != a[j] )
			{
				
				issame=false;
				break;
			}
			j--; 
			
		}
		if(issame)
		{
			System.out.println("Same ");
			
		}
		else
		{
			System.out.println("Not same");
		}

	}

}
