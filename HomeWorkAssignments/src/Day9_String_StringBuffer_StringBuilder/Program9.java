package Day9_String_StringBuffer_StringBuilder;
/*9. Write any 5 string functions with syntax. State its use.*/
public class Program9 
{

	public static void main(String[] args) 
	{
		
		String str="AbhishekAnilDevkhile";
		
		  //Print character wise:
		 System.out.println("1. Print character wise: "); 
		  char[] ch=str.toCharArray();
		 for (int i = 0; i < ch.length ; i++) 
		  {  	 
	          System.out.print(ch[i]+"  ");  
	      } 
		 System.out.println();
		// Substring method
		 System.out.println("2. Substring method: ");
		  	System.out.println("Substring method:"+str.substring(0,4));
		  	System.out.println("Substring method:"+str.substring(2));
		 
		  //String convert uppercase and lower case 
		  	System.out.println("3. String convert uppercase and lower case: ");
		  	System.out.println("String convert uppercase: "+str.toUpperCase());
		  	System.out.println("String convert lower case: "+str.toLowerCase());
		  	
		  //Returns the hash code 
		  	System.out.println("4.Returns the hash code: ");
			System.out.println("Returns the hash code of string:"+str.hashCode());
			
			//Replace with 
			System.out.println("5.Replace with : ");
			System.out.println("Replace with 'D'to 'd'  string:"+str.replace('D','d'));

	}

}
