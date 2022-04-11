package day7_Array;

import java.util.ArrayList;

public class DistOddEven {

	public static void main(String[] args) {

int[] b={1,2,3,4,5,6,7,8,9};  

ArrayList<Integer> a1=new ArrayList<>();
ArrayList<Integer> a2=new ArrayList<>();


		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0)
			{
				a1.add(b[i]);
			}
	/*		else
			{
				System.out.println("Odd no: "+b[i]);
			}
		*/		
		}
		System.out.println("Odd num:");
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2!=0)
			{
				a2.add(b[i]);
				
			}
		}
		System.out.println("Even nos:");
		for(int no:a1)
		{
			System.out.println(no +" ");
		}
		System.out.println("odd nos:");
		for(int no:a2)
		{
			System.out.println(no +" ");
		}

}
}
