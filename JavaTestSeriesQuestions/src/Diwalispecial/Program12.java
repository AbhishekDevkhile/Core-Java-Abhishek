package Diwalispecial;
/*12.	How to find the first non-repeating character in a given String? 
Write a program in any programming language you to find the first non-repeated 
character in a given String, for example, if the given String is "Java" then the 
first non-repeated character is "J"

*/
public class Program12 {

	public static void main(String[] args) {
		String s="nitina";
			
		for(int i=0;i<s.length();i++)
		{
			boolean ismatch=true;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j) && i != j)
				{
					ismatch=false;
					break;
				}
			}
			
			if(ismatch)
			{
				System.out.println(s.charAt(i));
				break;	
			}
		}
		

	}

	
}
