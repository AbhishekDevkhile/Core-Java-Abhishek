package Day10_Exception_Override;

import java.io.IOException;

class Parent2
{
//	rule2  if parent declare any excpetion
	
//	void show() throws Exception
//	{
//		
//	}
	
	
	//does not allowed
	void show() throws IOException
	{
		
	}
}
public class Exception_Child_Rule2 
{
	//rule 2
	
	
     //R1: child does not declare any excpetion
//		void show()
//		{
//			
//		}
		
    //R2:child declare same exception as parent
		
//		void show() throws Exception
//		{
//			
//		}
		
	//R3: child declare child exception of parent exception
		
//		void show() throws IOException
//		{
//			
//		}
	
                 //Or||And	
//		void show() throws NullPointerException
//		{
//			
//		}
	
	
	
		// does not allowed parent exception in child
//		void show() throws Exception  //error
//		{
//			super.show();
//			
//		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
