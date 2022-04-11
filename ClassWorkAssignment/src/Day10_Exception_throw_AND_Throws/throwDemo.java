package Day10_Exception_throw_AND_Throws;
/*Demo of throw keyword*/
public class throwDemo 
{
	/*
	//program 1 : try-catch handle in default method
	static void valid(int n)
	{
		try
		{
			if(n<18)
			{
				throw new  ArithmeticException("Age is not valid.");
			}
			else
			{
				System.out.println("age is valid.");
			}		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		valid(3);
	}
	*/
	
	
	
	
	
	//program 2 : try-catch handle in main method
		static void valid(int n)
		{
				if(n<18)
				{
					throw new  ArithmeticException("Age is not valid.");
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
			catch(Exception e)
			{
				//System.out.println(e);
				e.printStackTrace();
			}
		}

}
