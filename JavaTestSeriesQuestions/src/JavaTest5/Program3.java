package JavaTest5;
/*Write a Program to reverse a given string in place? (that means without using second
string)
*/
public class Program3 {
	public static void main(String[] args)
	{
	String str1="India is my Country";
	String s[]=str1.split(" ");
	
	  for (int i = 0; i < s.length ; i++) 
	  { 
		  String reverse=s[i]; 
		  char[] s1=reverse.toCharArray(); 
		  String revWord=" ";                             
		  for (int j=s1.length-1;j>=0 ; j--)       
		  {  
			  revWord=revWord+s1[j];          
          } 
		  System.out.print(revWord);
	  }

}
}
