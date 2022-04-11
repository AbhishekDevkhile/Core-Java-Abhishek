package Day10_Custom_Exception_throw_AND_Throws;

import java.util.Scanner;

class BinaryException extends Exception
{
	String msg;
	
	BinaryException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
}
public class Convert_BinaryToDecimal_CustomExcption 
{
	int r=0;
	//int p=0;
	public void Binarynumber(int num) throws BinaryException
	{
		int originalnum=num;                //given num store in temp
		boolean flag=true;
		while(num>0)                   //logic(not a binary number logic)
		{
			int r=num%10;
			if(r>1 || r<0)
			{
				flag=false;
				break;
			}
			num=num/10;
		}
		
		
		num=originalnum;      //again reinitialize num value 
		if(flag==true)
		{
			System.out.println(" is a Binary number ");
			
			int decimalnumber=0;
			int power=0;
			while(num>0)                    //logic binary to decimal 
			{
				int temp=num%10;
				decimalnumber += (temp*Math.pow(2,power));
				num=num/10;
				power++;	
			}
			System.out.println("Decimal number is::"+decimalnumber);
		}
		else
		{
			throw new BinaryException("Is not a Binary Number.");
		}		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number::");
		int num=sc.nextInt();
		try
		{
			Convert_BinaryToDecimal_CustomExcption c=new Convert_BinaryToDecimal_CustomExcption();  //create object
			c.Binarynumber(num);                                  //call method
		}
		catch(BinaryException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
	}
}
