package day9_String;
/*String str="Abhishek Anil Devkhile"
       O/P:::
           Abhishek  
           Abhishek  Anil  
           Abhishek  Anil  Devkhile */
public class OneByOneWordPrint {

	public static void main(String[] args) {
		String str="Abhishek Anil Devkhile";
		
		String s[]=str.split(" "); 
		
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
