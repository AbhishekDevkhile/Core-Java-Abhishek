package Diwalispecial;

import java.util.Scanner;

/*3.	Consider integer array containing values sequentially from 65 to 90 like this  :    
    int a[] = { 65,66,67,…..88,89,90}.
  Accept a String from User and display encoded string .Numbers from this array to be used       to encode it as shown below
Eg. If String entered is “HELLO” then its encoding should be displayed like 
72#69#76#76#79 
*/
public class Program3 
{

	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter String:");
		 String str=sc.nextLine();
		 int arr[]= {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};
		 byte b[]=str.getBytes();
		 System.out.println("Encoded String:");
		 for(int i=0;i<b.length;i++)
		 {
			 System.out.println(b[i]+" ");
		 }
		 System.out.println();
		 System.out.println("Output:");
		 for(int i=0;i<b.length;i++)
		 {
			 for(int j=0;j<arr.length;j++)
			 {
				 if(b[i]==arr[j])
				 {
					 System.out.print(b[i]+"#");
				 }
			 }
		 }
	}

}
