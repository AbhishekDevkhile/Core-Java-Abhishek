package Day10_Custom_Exception_throw_AND_Throws;
/*Create a custom exception to check given number is binary or not.if given number is not binary
 then throw ExceptionValidBinary */

import java.util.Scanner;

class ExceptionValidBinary extends Exception
{
	String msg;
	ExceptionValidBinary(String msg)
	{
		this.msg=msg;
	}
	public String getMessage() 
	{
		return msg;
	}
}

public class Check_ExceptionValidBinaryOrNot 
{
	public static void CheckBinary() throws ExceptionValidBinary
	{
		Scanner sl=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sl.nextInt();
			int count1=0,count2=0;
			int temp=num;
			while(num>0)
			{
				if((num %10==0)|| (num%10==1))
					count1++;
				count2++;
				num=num/10;  
			}
			if(count1==count2)
			{
				System.out.println(temp+" is a Binary Number.");
			}
			else
			{
				throw new ExceptionValidBinary ("is not a Binary Number"); 
			}
		}

	public static void main(String[] args) 
	{
		try
		{
			CheckBinary();
		}
		catch(ExceptionValidBinary e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Exception handle");
     
     

	}

}
