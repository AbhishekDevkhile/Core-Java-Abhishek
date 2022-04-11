
package day9_String;

public class PrintReverseString 
{

	public static void main(String[] args) 
	{
		String str=("I like Java Programming");
		
		String c[]=str.split(" ");
		
		 String reverse=" ";
		  for (int i =c.length-1; i>=0; i--) 
		  { 
			  reverse=reverse+"  "+c[i];
			  
		  }
		  System.out.println(reverse+" ");
		  
	}

}
