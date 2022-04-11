package day9_String;
/*WAJP to find out of the no. of character from the String*/
public class FindNoOfChar 
{

	public static void main(String[] args) 
	{
		String str="Abhishek Anil Devkhile";
		
		System.out.println("Length of String:"+str.length());
		
		                 //OR
		System.out.println("//////////////////*////////////////////");
		
		
		char[] ch=str.toCharArray();   //toCharArray()=> display character Array 
		int count1 = 0;
		  for (int i = 0; i < ch.length ; i++) 
		  {  
	          count1++;
	      } 
		  System.out.println("Length of String:"+count1);
		
		
		
	}

}
