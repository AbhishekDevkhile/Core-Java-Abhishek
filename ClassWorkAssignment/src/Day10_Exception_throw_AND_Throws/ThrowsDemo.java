package Day10_Exception_throw_AND_Throws;
/*Demo of throws keyword*/
import java.io.IOException;

public class ThrowsDemo 
{
	static void valid(int n) throws IOException
	{
			if(n<18)
			{
				throw new  IOException("Age is not valid.");
			}
			else
			{
				System.out.println("age is valid.");
			}		
	}

	public static void main(String[] args)
{
		try
		{
			valid(3);
		}
		catch(IOException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}

	}

}
