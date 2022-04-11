package JavaTest7;

import java.util.Scanner;
/*10) Write a java program to find all pairs of elements in an integer array whose sum is equal to a given number?									[1M]
Input Array : [4, 6, 5, -10, 8, 5, 20]
InputNumber:10
Pairs of elements whose sum is 10 are :
4 + 6 = 10
5 + 5 = 10
-10 + 20 = 10
*/
public class Program10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input::");
		int input=sc.nextInt();
		int[] a= {4,6,-8,9,-7,4,-4,6,-6,13,19,-10,8,1,2,-2,-9,10,0};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==input)
				{
					System.out.println(a[i]+" + "+a[j]+" =s  "+input);
				}
			}
		}

	}

}
