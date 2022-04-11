package day9_String;
/*WAJP count num of digit from the String*/
public class CountDigitInString {

	public static void main(String[] args) {
		String str=("I4li3ke In2dia c5oun9try1 ");
		int count =0;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)) )
			{
				count++;
			}
			
		}
		System.out.println("num of digit from the String:"+count);
	
		
	 /*
		int count1 = 0;
		  for (int i = 0; i < str.length() ; i++) 
		  {  
			  if(str.charAt(i)>=48 && str.charAt(i)<=57)
			  {
				  count1++;
			  }
	      } 
		  System.out.println("num of digit from the String:"+count1);
	*/
	}
	

}
