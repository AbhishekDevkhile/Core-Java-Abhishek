package JavaTest5;
/*1.	Find largest word in a String “I like programming”. You can
use split function of string
*/
public class Program1 {

	public static void main(String[] args) 
	{
		String str=("I like Programming");
		
		String c[]=str.split(" ");
		
		 String largeWord=" ";
		  for (int i=0;i<c.length-1; i++) 
		  { 
			  for(int j=i+1;j<c.length;j++)
			  {
				  if(c[i].length() < c[j].length())
				  {
					  largeWord=c[j];
				  }
			  }	  
		  }
		System.out.println(largeWord);
	}

}
