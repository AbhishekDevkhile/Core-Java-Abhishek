package Day10_Exception_Override;
class Parent1
{
	//rule 1 if parent does not declare any exception
	void show()
	{
		
	}
}
public class Exception_Child_Rule1
{
	//rule 1 child can also does not declare any exception or
		//if child to declare any exception then only runtime exception allowed
	
       //R1: does not declare any excption	
//		void show()//does not declare any excption
//		{
//			
//		}
	
	   //R2://allowed unched or runtime excpetion
//		void show() throws ArithmeticException //allowed unched or runtime excpetion
//		{
//			
//		}
	
	   //R3:error checked not allowed
//		void show() throws IOException //error checked not allowed
//		{
//			
//		}

	public static void main(String[] args) 
	{
		

	}

}
