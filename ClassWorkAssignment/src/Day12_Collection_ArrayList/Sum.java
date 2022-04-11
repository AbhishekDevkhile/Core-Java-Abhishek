package Day12_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input:");
		ArrayList<Integer> list=new ArrayList();
		int n = 5;
		int  a;
		
		
		for(int i=0;i<n;i++)
		{
		    a=sc.nextInt();
			list.add(a);
		}
		int sum=0;
		for(int i=0;i<list.size();i++)
		{
			sum=sum+list.get(i);
		}
		System.out.println(sum);

	}

}
