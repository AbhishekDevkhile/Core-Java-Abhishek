package day9_StringBuffer;

public class StringBufferDemo 
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer("Hello");
		StringBuffer sb2=new StringBuffer("Hello");
		
		
		//Default capacity of String
		System.out.println( sb.capacity());   
	

		System.out.println(sb1.append("  "+"Hii"));
		
		//Insert
		sb1.insert(5, "Abhi");
		System.out.println(sb1);
		
		//replace
		sb1.replace(2, 4, "ZZZ");
		System.out.println(sb1);
		
		//delete
		sb1.delete(1, 3);
		System.out.println(sb1);
		
		//reverse
		sb1.reverse();
		System.out.println(sb1);
		/*
		//equals()
		System.out.println(sb1.equals(sb2));   //StringBuffer class does not override equal method of object class 
		                                     //but string class override the equal methods  of object class
		 */
		
	}

}
