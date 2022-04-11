package Day10_Exception_Override;

import java.io.IOException;

class Parent
{
	//rule 1 if parent does not dclare any exception
//	void show()
//	{
//		
//	}
	
//	rule2  if parent declare any excpetion
	
//	void show() throws Exception
//	{
//		
//	}
	
	void show() throws IOException
	{
		
	}
	
}
public class ExceptionRules_ChildClass extends Parent{
	//rule 1 child can also does not declare any exception or
	//if child to declare any exception then only runtime exception allowed
//	void show()//does not declare any excption
//	{
//		
//	}
//	void show() throws ArithmeticException //allowed unched or runtime excpetion
//	{
//		
//	}
//	void show() throws IOException //error checked not allowed
//	{
//		
//	}

	//rule 2
	//child does not declare any excpetion
//	void show()
//	{
//		
//	}
//	
	//child declare same exception as parent
	
//	void show() throws Exception
//	{
//		
//	}
	
	// child declare child exception of parent exception
	
//	void show() throws IOException
//	{
//		
//	}
//	void show() throws NullPointerException
//	{
//		
//	}
	// does not allowed parent exception in child
//	void show() throws Exception  //error
//	{
//		super.show();
//		
//	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
