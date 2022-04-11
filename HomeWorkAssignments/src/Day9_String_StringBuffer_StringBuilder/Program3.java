package Day9_String_StringBuffer_StringBuilder;

import java.util.Scanner;

/*3. Write a program to find the number of vowels, consonants, digits and white 
  space characters in a string.*/

public class Program3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String::");
		String s=sc.nextLine();
		int vowels=0,consonants=0,digits=0,spaces=0;
		char str[] = s.toCharArray();
		int n= str.length;
		  for(int i=0;i<n;i++)
		    {
		      if(str[i]=='a' || str[i]=='e' || str[i]=='i' ||str[i]=='o' || str[i]=='u' || str[i]=='A' ||str[i]=='E' || str[i]=='I' || str[i]=='O' ||str[i]=='U')
		      {
		          vowels++;
		      }
		      if((str[i]>='a'&& str[i]<='z') || (str[i]>='A'&& str[i]<='Z'))
		      {
		           consonants++;
		      }
		      if(str[i]>='0' && str[i]<='9')
		      {
		           digits++;
		      }
		    if (str[i]==' ')
		      {
		            spaces++;
		      }
		         
		  }
		  System.out.println("Vowels = "+vowels);
		  System.out.println("Consonants = "+consonants);
		  System.out.println("Digits = "+digits);
		  System.out.println("White spaces = "+spaces);	   
	}
}


