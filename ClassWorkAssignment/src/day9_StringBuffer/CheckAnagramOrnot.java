package day9_StringBuffer;

public class CheckAnagramOrnot {

	public static void main(String[] args) 
	{
		
	      String sb ="abhishek";
	      String sb1 ="Devkhile";
	       
	      sb=sb.toUpperCase();
	      sb1=sb1.toUpperCase();
	      
	     if(sb.length() == sb1.length())
	     {
	      boolean isAnagram = true;
			
			int j=sb1.length()-1;
			for(int i=0;i<sb.length();i++) 
			{
				if(sb.charAt(i)!=sb1.charAt(j)) 
				{
					isAnagram = false;
					break;
				}
				j--;
			}
			
			if(isAnagram) 
			{
				System.out.println("is Anagram.");
			} 
			else 
			{
				System.out.println(" is not Anagram.");
			}
	     }
	     else
	     {
	    	 System.out.println("Length is not match");
	     }
	
		
		
/*
	      String sb ="abhishek";
	      String sb1 ="Devkhile";
	      
	      
	      sb=sb.toUpperCase();
	      sb1=sb1.toUpperCase();
	      
	      
	     if(sb.length() == sb1.length())
	     {
	      boolean isAnagram = true;
			
			
			for(int i = 0; i<sb.length()-1; i++)   
			{  
			for (int j = i+1; j<sb.length(); j++)   
			{    
			String[] countries;
			if(sb[i].compareTo(sb[j])>0)   
			{  
			//swapping array elements  
			String temp = countries[i];  
			countries[i] = countries[j];  
			countries[j] = temp;  
			}  
			}  
			}  
			
			
			
			if(isAnagram) 
			{
				System.out.println("is Anagram.");
			} 
			else 
			{
				System.out.println(" is not Anagram.");
			}
	     }
	     else
	     {
	    	 System.out.println("Length is not match");
	     }
	
*/
	}

}
