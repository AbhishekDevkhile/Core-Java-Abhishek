package Day10_Custom_Exception_throw_AND_Throws;

/*WAJP to create custom exception for the given sceaniro take base anr index from user and calculate 
the power of base respected to the exponent .if the index is negative then throw 
custom exception NegativeIndexException, otherwise calculate power  */

import java.util.Scanner;
class Invalidnumber extends Exception
{
	String msg;
	Invalidnumber(String msg)
	{
		this.msg=msg;
	}
	
	public String getMessage()
	{
		return msg;
	}
	
}
public class ExponentCalculate {

	public static void main(String[] args) throws Invalidnumber 
	{
		System.out.println("find Power of base using while loop");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter base no:");
		int base = sc.nextInt();
		
		System.out.println("Enter Exponent No: ");
		int exp = sc.nextInt();
		try
		{
			if(exp<=0)
			{
				throw new Invalidnumber("Exponent is less than Zero");
			}
			else
			{
				int ans=1;
				while(exp != 0)
				{
				 ans = ans * base ;
				 exp--;
				}
	         System.out.println("Answer = " +ans);
		   }
		}
			catch(Invalidnumber e)
			{
			
				//e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e.getClass());
			}
		 

	}

}
