package JavaTest5;
/*4.	Reverse middle words of a string
Given a string str, print reverse all words except the first and last words.

Examples:
Input: Hi how are you students
Output: Hi woh era uoy students
*/
public class Program4 
{
	public static void main(String[] args) 
	{
		String str="India is my Country";
	     
		String s[]=str.split(" "); 
	    String originalStr=" ";
		  for(int i=1;i<s.length-1;i++)                         //Split method for loop
		  { 
			  String reverse=s[i];                            //above Split String store in String variable(reverse=s[i])           
			  String revWord=" "; 
			  
			  for (int j=reverse.length()-1;j>=0 ; j--)       //reverse word  forloop logic
			  {  
				  
		          revWord=revWord+reverse.charAt(j);          //logic
		      } 
			  originalStr=originalStr+revWord;                       //store 
		  }
		  System.out.println(s[0]+"  "+ originalStr+"  "+s[s.length-1]);
		 
		}



}
