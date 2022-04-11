package Day9_String_StringBuffer_StringBuilder;
/*Write a Java program to remove first and last occurrence of a
  word from string.*/
public class Program8 {
	public static void main(String[] args) {
		String str="Abhishek";
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			 str1=str.substring(1, str.length()-1);
		}
		 System.out.println(str1);

	}

}
