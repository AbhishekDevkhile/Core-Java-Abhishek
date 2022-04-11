package Day10_Custom_Exception_throw_AND_Throws;

public class CheckString_AlphabetOrDigit_UsingCustomExcp 
{

	public static void main(String[] args) 
	{
		String str="1s2d3h4j5";
		char ch[] = str.toCharArray();
		int sum=0;
		for (int i = 0; i < ch.length; i++) 
		{
		
			if(Character.isDigit(ch[i]) )
			{
				sum=sum+ch[i];
			}
			
		}
		System.out.println(sum);
		

	}

}
