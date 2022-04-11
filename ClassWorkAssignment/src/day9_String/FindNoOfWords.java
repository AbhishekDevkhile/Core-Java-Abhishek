package day9_String;
/*WAJP to find no. of words from the String*/
public class FindNoOfWords 
{

	public static void main(String[] args) 
	{
		String str="Abhishek Anil Devkhile";
		
		int count=0;
		String s[]=str.split(" ");
		  for(int i=0;i<s.length;i++)
		  {
			  //System.out.println(s[i]);
			  count++;
		  }
		  
		  System.out.println("No of words:"+count);

	}

}
