package day9_String;

/*
 I/p=>Abhishek Anil Devkhile
 
    O/p=> A.A.Devkhile*/



public class PrintNameInShortForm {

	public static void main(String[] args) {
		String str="Abhishek Anil Devkhile";
		
		String s[]=str.split(" ");
		String p="";                                     //empty(store) string initialized
		for(int i=0;i<s.length-1;i++)
		{
			p=p+s[i].charAt(0)+".";                 //find first character of array(word)
		}
		
		String s2=p+s[s.length-1];            //concate surname and  above string
		System.out.println(s2);
		
		
		
	}

}
