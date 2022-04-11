package day2;

import java.util.Scanner;

public class Count_Freq_of_Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input:");
		int num = sc.nextInt();
		int temp = num;
		int dig;
		int Digit[]= new int[100];
		while(temp>0) 
		{
			dig = temp%10;
			for(int i=0;i<=9;i++)
			{
				if(dig==i)
				{
					Digit[i]++;
				}
			}
			temp=temp/10;
		}
		System.out.println("Original no :" +num);
		for(int i=0;i<=9;i++)
		{
			if(Digit[i]!=0) 
			{
				System.out.println("Frequency of " +i+ " is " +Digit[i]);;
			}
		}
		
		
		
		System.out.println();
		System.out.println();
		
		  Scanner in = new Scanner(System.in);
	        int num1,p,dig1,i,digit,count=0;
	        System.out.println("Enter Number");
	        num1 = in.nextInt();
	        p=num1;
	        System.out.println("Enter Digit whose frequency is required");
	        digit = in.nextInt();
	        while(p>0)
	        {
	            dig1 = p%10;
	            if(dig1 == digit)
	            {
	                count++;
	            }
	            p=p/10;
	        }
	        System.out.println("Original Number : "+num1);
	        System.out.println("Frequency of "+digit+" is : "+count);
	  
	}

}
