package Day10_Custom_Exception_throw_AND_Throws;
/*WAJP to create custom exception for the given sceaniro take base anr index from user and calculate 
  the power of base respected to the exponent .if the index is negative then throw 
  custom exception NegativeIndexException, otherwise calculate power  */
import java.util.Scanner;

class NegativeIndexExponent extends Exception
{
	String msg;
	public NegativeIndexExponent(String msg) 
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
	
	
}
public class ExponentCalculateUsingMethod 
{
	public static void calculateExponent(int Exp,int base) throws NegativeIndexExponent
	{
		if(Exp <= 0)
		{
			throw new NegativeIndexExponent ("Invalid number");
		}
		else
		{
			int ans=1;
			while(Exp != 0)
			{
			 ans = ans * base ;
			 Exp--;
			}
         System.out.println("Answer = " +ans);
		}
		
	}

	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter base no:");
		int base = sc.nextInt();
		
		System.out.println("Enter Exponent No: ");
		int exp = sc.nextInt();
		
		try
		{
			calculateExponent(exp, base);
		}
		catch(NegativeIndexExponent e)
		{
			e.printStackTrace();
		}
		System.out.println("HEllO");

	}

	

}
