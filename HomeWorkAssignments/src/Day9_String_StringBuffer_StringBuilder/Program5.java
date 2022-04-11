package Day9_String_StringBuffer_StringBuilder;
/*Write a Java program to count occurrences of a word in a given string.*/
public class Program5
{

	public static void main(String[] args) 
	{
		
		String str="When he was in  school,he would take much interest in sport ";
		String str2="in";
		
		String s[]=str.split(" ");
		int count=0;
		
		for(int i=0;i<s.length;i++)
		{
			if(str2.equals(s[i]))
			{
				count++;
			}
		}
		System.out.println("The word (" + str2 + ") =>  " + count + " times occurs ");

		
	}

}
