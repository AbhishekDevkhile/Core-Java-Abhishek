
package day7_Array;
/*Print toggle case character*/
public class ToggleCase {
	public static void main(String[] args) 
	{
		
			char c[]= {'a','b','c','F','t','R'};
			
			for(int i=0;i<c.length;i++)
			{
				if(c[i]>='A' && c[i]<='Z')
				{
					c[i]=(char)((int)c[i]+32);    //ascii value convert
				}
				else if(c[i]>='a' && c[i]<='z')
				{
					c[i]=(char)((int)c[i]-32);
				}
			}
			System.out.println("Toggle case::");
		for(char a:c)
		{
			System.out.print(a+" ");
		}


	}

}
