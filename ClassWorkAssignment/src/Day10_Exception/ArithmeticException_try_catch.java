package Day10_Exception;
/*WAJP to show Arithmetic exception with try catch block*/
public class ArithmeticException_try_catch 
{

	public static void main(String[] args) 
	{
		
		int a=100,b=0,c;
		try 
		{
			c=a/b;
			System.out.println("Division is:"+c);
		 }
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception p)
		{
			System.out.println(p);
		}
		
		
	
		///////////////////////////////////////////////////////////////
		
		
		System.out.println("aaaaaaaaaa");
		int g=100,h=0,i;
		try 
		{
			System.out.println("TTTTTTTTTTTTTTTT");
			i=g/h;
			System.out.println("Division is:"+i);
		 	System.out.println("bbbbbbbbbbb");
		}
		
		catch(ArithmeticException n)
		{
			System.out.println("fffffffffffffffffff");
			System.out.println(n);
		}
		catch(Exception o)
		{
			System.out.println("GGGGGGGGGGGGGGGGGGGGGG");
			System.out.println(o);
		}
		
		System.out.println("dddddddddddddd");
		
	}

}
