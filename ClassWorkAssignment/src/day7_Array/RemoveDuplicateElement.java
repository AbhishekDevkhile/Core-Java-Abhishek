package day7_Array;

import java.util.Scanner;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of A Array::");
		int sizea=sc.nextInt();
		int a[]=new int[sizea];
		System.out.println("Enter A array Element::");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter size of B Array::");
		int sizeb=sc.nextInt();
		int b[]=new int[sizeb];
		System.out.println("Enter B array Element::");
		for(int i=0;i<a.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		int c[]=new int[a.length+b.length];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int x=0;
			for(int j=count-1;j>=0;j--)
			{
				if(a[i]==c[j])
				{
					x++;
				}
			}
			if(x==0) 
			{
				c[count]=a[i];
				count++;
			}
			
		}
		for(int i=0;i<b.length;i++)
		{
			boolean f=false;
			for(int j=count-1;j>=0;j--)
			{
				if(c[j]==b[i])
				{
				f=true;
				break;
				}
			}
		
		if(f==false)
		{
			c[count]=b[i];
			count++;
		}
	}
		System.out.println("Merge array::");
		for(int i=0;i<count;i++)
		{
			System.out.print(c[i]);
		}

	}

}
