package day7_Array;
/*replace char by alternate char(char+2)*/
import java.util.Arrays;

public class PrintAlternateCharArray {

	public static void main(String[] args) {
		char a[]= {'d','p','a','z','r'};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a' && a[i]<='x')
			{
				a[i]=(char)(a[i]+2);
			}
			else if(a[i]=='y')
			{
				a[i]='a';
			}
			else if(a[i
			          ]=='z')
			{
				a[i]='b';
			}
			
		}
		//System.out.println(Arrays.toString(a));
		for(char p : a)
		{
			System.out.print(p+"  ");
		}
		
	}

}
