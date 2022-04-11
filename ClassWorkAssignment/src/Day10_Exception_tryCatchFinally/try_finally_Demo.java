package Day10_Exception_tryCatchFinally;
/*WAJP to show try finally block */
public class try_finally_Demo 
{
    
	public static void main(String[] args) 
	{
		/*
		//program 1://Exception generates
		int a=10,b=0,c;
		try
		{
			c=a/b;                              //Exception generates
			System.out.println(c);
		}
		finally
		{
			System.out.println("finally block is always executed.");
		}
		System.out.println("rest of code.");          //exception is not handle(catch box is not declear) thats why this line is not execute.
		*/
		
		System.out.println("///////////////////////////////");
		
		
		
		//program 2:Exception not generates
		int p=10,q=2,r;
		try
		{
			r=p/q;                              //Exception not generates
			System.out.println(r);
			System.out.println("Abhi");
		}
		finally
		{
			System.out.println("finally block is always executed.");
		}
		System.out.println("rest of code.");
		

	}

}
