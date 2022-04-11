package Day10_Exception_throw_AND_Throws;
/*show the propagation of runtime exception(uncheck type of exception)*/
import java.io.IOException;

public class Propagtion_of_throw_keyword 
{

	void method3() 
	{
		method2();
	}
	
	void method2() 
	{
		method1();
	}
	
	void method1() 
	{
		String s=null;
		System.out.println(s.length());     //if method is uncheked exception that time throw is not complesory becoz that time error handle in catch block like ArithmeticExceptionn, nullPointerException.  
		
		
	}
	public static void main(String[] args) 
	{
		 Propagtion_of_throw_keyword o=new  Propagtion_of_throw_keyword();
		
		try
		{
			o.method3();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
