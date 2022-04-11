package day9_String;

public class MethodOfDemo {

	public static void main(String[] args) {
		String s=new String("Abhishek Devkhile");
		
		//length of String
		System.out.println("Length of String:"+s.length());
		
		//index of given Character
		System.out.println("index of given character:"+s.indexOf(0));

		//Given index character are
		System.out.println("Given index character are:"+s.charAt(9));
	
		
		
		//Given index of String
		System.out.println("Given index String are:"+s.indexOf("kh"));
		
		//last index of string
		System.out.println("Last string of string"+s.lastIndexOf("le"));
		
		
		//Returns the hash code 
		System.out.println("Returns the hash code of string:"+s.hashCode());
		
		//Replace with 
		System.out.println("Replace with 'D'to 'd'  string:"+s.replace('D','d'));
		
		//String starts with 
		System.out.println("String starts with: "+s.startsWith("Ab"));
	    System.out.println("String starts with: "+s.startsWith("de"));
	    
	  //String ends with 
	  	System.out.println("String starts with: "+s.endsWith("le"));
	  	System.out.println("String starts with: "+s.endsWith("de"));
	  	
	  //String convert uppercase and lower case 
	  	System.out.println("String convert uppercase: "+s.toUpperCase());
	  	System.out.println("String convert lower case: "+s.toLowerCase());
	  	
	  //String Split 
	  String str[]=s.split(" ");
	  for(int i=0;i<str.length;i++)
	  {
		  System.out.println("Split given string:"+str[i]);
	  }
	  

	  //Print character wise:
	  char[] ch=s.toCharArray();
		System.out.println("use of toCharArray():");
	  for (int i = 0; i < ch.length ; i++) 
	  {  
          System.out.println(ch[i]);  
      } 
		
	  	
	  // Substring method
	  	System.out.println("Substring method:"+s.substring(0,4));
	  	System.out.println("Substring method:"+s.substring(2));
	  	
	
	}

}
