package day4_StaticVariableOrMethod;
/*Blocks calling sequence
 * 1)Static block:only one time execute
 * 2)Instance block:create no. of object them call no, if time
 * 3)Constructor:create no. of object them call no, if time
 *
 * 
 * */
public class InstanceBlock {
	static               //Static method call
	{
		System.out.println("Static blocks");
	}
	
	InstanceBlock()
	{
		System.out.println("default");
	}
	
	
	{
		System.out.println("Initilizerblock");
	}
	

	public static void main(String[] args) 
	{
		//System.out.println("main");
		InstanceBlock  i=new InstanceBlock();
		InstanceBlock i1=new InstanceBlock();
		
	}
	
	static               //static block call outside of main method 
	{
		System.out.println("Static blocks defined in outside of main method");
	}
	
	

}
