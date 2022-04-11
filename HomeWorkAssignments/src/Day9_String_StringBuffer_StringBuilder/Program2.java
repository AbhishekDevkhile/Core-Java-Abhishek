package Day9_String_StringBuffer_StringBuilder;
/*2. Write a code to prove that strings are immutable in java?*/
public class Program2 
{

	public static void main(String[] args) 
	{
		String s1="Abhishek";
		//System.out.println(s1);
		s1.concat("Devkhile");
		System.out.println(s1);  
	}

}

		
/*Conclusion :
  Immutability is the fundamental property of string objects. 
    In whatever way you create the string objects, either using string literals or 
    using new operator, they are immutable.*/