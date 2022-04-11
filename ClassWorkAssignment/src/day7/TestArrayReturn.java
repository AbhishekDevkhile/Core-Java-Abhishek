package day7;

import java.util.Scanner;



public class TestArrayReturn {
	int a[];
	
	void create()
	{
		a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();   //input
		}
	}

	int [] get()
	{
		System.out.println("Display hashcode of a[]::"+a);   ///hash code 
		return a;         //return int type of array  
	}
	public static void main(String[] args) {
		TestArrayReturn p=new TestArrayReturn();
		p.create();
		
		int d[]=p.get();    //return on p[]
		
		System.out.println("Display hashcode of d[]::"+d);     //hash code print of d
		//display Array
		System.out.println("Display Array element::");
		for(int i=0;i<d.length;i++)
		{
			
			System.out.println(d[i]);
		}
	}

}
