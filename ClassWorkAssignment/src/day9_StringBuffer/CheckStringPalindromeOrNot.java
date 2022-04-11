package day9_StringBuffer;
/*Using StringBuffer string is Palindrome or not*/
public class CheckStringPalindromeOrNot {

	public static void main(String[] args) {
		/*
		 String str = "nayan";
		 
	      StringBuffer sb = new StringBuffer(str);
	      
	      System.out.println(sb.reverse());
	      
	      String data = sb.toString();
	      if(str.equals(data))
	      {
	         System.out.println(str + " string is palindrome.");
	      }
	      else
	      {
	         System.out.println(str + " string is not palindrome.");
	      }
	*/
	
	
	 ///Second logic:
		
	   //   StringBuffer str =new  StringBuffer( "nitin");
		     String str="NIkhIN";	
			boolean isPalindrome = true;
			
			int j=str.length()-1;
			for(int i=0;i<str.length();i++) 
			{
				if(str.charAt(i)!=str.charAt(j)) 
				{
					isPalindrome = false;
					break;
				}
				j--;
			}
			
			System.out.println();
			
			if(isPalindrome) 
			{
				System.out.println(str+"\n is Palindrome.");
			} 
			else 
			{
				System.out.println(str+" \n is not Palindrome.");
			}
	
	
	}

}
