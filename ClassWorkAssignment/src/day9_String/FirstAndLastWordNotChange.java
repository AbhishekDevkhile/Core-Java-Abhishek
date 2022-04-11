package day9_String;

public class FirstAndLastWordNotChange 
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


