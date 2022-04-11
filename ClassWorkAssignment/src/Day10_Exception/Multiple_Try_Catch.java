package Day10_Exception;
/*WAJP to show try with multiple catch block*/
public class Multiple_Try_Catch 
{

	public static void main(String[] args) 
	{
		try
		{
		String s[]=null;
		
		System.out.println(s.length);
		}
		catch(ArithmeticException e)
		{
			  System.out.println("Error type is:"+e.getClass());
			  System.out.println("Arithmetic Exception occurs");
			  System.out.println("Error message:"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			   System.out.println("Error type is:"+e.getClass());
			   System.out.println("ArrayIndexOutOfBounds Exception occurs");
			   System.out.println("Error message:"+e.getMessage());
		}
		catch(Exception e)  
        {  
			  System.out.println("Error type is:"+e.getClass());
			  System.out.println("Parent Exception occurs"); 
			  System.out.println("Error message:"+e.getMessage());
        }  
		 System.out.println("Out of code"); 
		

	}

}
