package JavaTest5;

public class Program6 {
	public static void main(String[] args) 
	{
		String num="12345321";
		boolean ispresent=true;
		int sum1=0;
		int sum2=0;
		for(int i=0;i<num.length();i++)
		{
			if(num.charAt(i)>='a' && num.charAt(i)<='z' || num.charAt(i)>='A' && num.charAt(i)<='Z' )
			{
				ispresent=false;
				break;
				
			}
		}
			if(ispresent== false)
			{
				System.out.println("Error....Above string character are present");
			}
			else
			{
				for(int i=0;i<3;i++)
				{
					sum1=sum1+Character.getNumericValue(num.charAt(i));
					
				}
				for(int i=num.length()-1;i>num.length()-3 ;i--)
				{
					sum2=sum2+Character.getNumericValue(num.charAt(i));
				}
				if(sum1==sum2)
				{
					System.out.println("String is valid");
				}
				else
				{
					System.out.println("Invalid String");
				}
				
			}
		
		

	}

}
