package JavaTest5;
/*2.	String s="India is my country" create patteren using String and  insert @ inseted of i/I
@nd@a 
@nd@a @s 
@nd@a @s my 
@nd@a @s my country
*/
public class Program2 {

	public static void main(String[] args) {
		String str="India is my country";
		String replaceString=str.replace('i','@');
		String replaceString1=replaceString.replace('I','@' );
		String s[]=replaceString1.split(" "); 
		for(int i=0;i<s.length;i++)                        
		  {
			  for(int j=0;j<=i;j++)
			  {
				  System.out.print(s[j]+"  ");
			  }
			  System.out.println();
		  }
			  

	}

}
