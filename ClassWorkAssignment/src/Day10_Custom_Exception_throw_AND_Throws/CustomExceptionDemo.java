
package Day10_Custom_Exception_throw_AND_Throws;

/*Demo of custom Exception*/

class AgeValidException  extends Exception
{
	String msg;
	AgeValidException(String msg)
	{
		this.msg=msg;
	}
	
	public String getMessage()
	{
		return msg;
	}
	
}


public class CustomExceptionDemo 
{

	
	static void valid(int age) throws AgeValidException
	{
		if(age<18)
		{
			throw new AgeValidException ("Invalid age");
		}
		else
		{
			System.out.println("Valid");
		}
	}
	public static void main(String[] args) 
	{
	
		try
		{
		valid(12);
		}
		catch(AgeValidException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	
		System.out.println("hello");

	}

}
