package Day10_Exception_tryCatchFinally;
/*WAJP to show try-catch-finally block*/
public class Try_Catch_Final_Demo {

	public static void main(String[] args) {
		String str=null;
		try
		{
		System.out.println(str.length());
		}
		catch(Exception e)
		{
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally block is always executed.");
		}
		System.out.println("rest of code.");

	}

}
