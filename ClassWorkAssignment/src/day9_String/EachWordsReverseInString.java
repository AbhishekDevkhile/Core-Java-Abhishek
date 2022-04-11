package day9_String;
/*Reverse word by word in given string*/
public class EachWordsReverseInString {

	public static void main(String[] args) {
		String str="Abhishek Anil Devkhile";
		/*
		String s[]=str.split(" ");                            //Split given String
		  for(int i=0;i<s.length;i++)                         //Split method for loop
		  {
			  String reverse=s[i];                            //above Split String store in String variable(reverse=s[i])           
			  String revWord=" ";                             //initialize revWord String
			  for (int j=reverse.length()-1;j>=0 ; j--)       //reverse word  forloop logic
			  {  
		          revWord=revWord+reverse.charAt(j);          //logic
		      } 
			  System.out.print(revWord);                       //store
			  
		  }
		  */
		
		
		            //OR ////////logic Second
		
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
