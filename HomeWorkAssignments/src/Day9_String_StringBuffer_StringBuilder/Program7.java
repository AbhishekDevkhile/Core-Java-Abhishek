package Day9_String_StringBuffer_StringBuilder;
/*Write a Java program to trim leading white space characters in a string.
 (using string function and without using string function)*/
public class Program7 {

	public static void main(String[] args) 
	{
	/*	//Using Trim method 
		String str = "  Abhishek Anil Devkhile  "; 
		System.out.println("Before Triming size:"+str.length());
		System.out.println(str);
		String ans = str.trim();
		System.out.println("After Triming size:"+ans.length());
		
		System.out.println(ans);
		*/
		//Without usin trim method
		
		
		String str1 = "  Abhishek Anil Devkhile  ";
		char[] charArray = str1.toCharArray();
        
        String stringWithoutSpaces = "";
         
        for (int i = 0; i < charArray.length; i++) 
        {
            if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
            {
                stringWithoutSpaces = stringWithoutSpaces + charArray[i];
            }
        }
         
        System.out.println("Input String : "+str1);
         
        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
         
        
	

	}

}
