package day9_String;
/*Create a String with all possible ways and display it */
public class StringDemo 
{

	public static void main(String[] args) 
	{
		//using string Literal
		String s1="Abhishek"; 
		System.out.println(s1);
		
		
		
		char ch[]={'D','e','v','k','h','i','l','e'};    
		String s2=new String(ch);
		System.out.println(s2);
		
		
		//Using new keyword(Using object)
		String s3=new String("Abhishek Devkhile");
		System.out.println(s3);
	    
		}
   

}


