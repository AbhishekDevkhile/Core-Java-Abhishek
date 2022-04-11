package day4_StaticVariableOrMethod;

public class StaticBlock {
	
	static               //Static method call
	{
		System.out.println("Static blocks");
	}
	
	StaticBlock()
	{
		System.out.println("default");
	}
	
	
	{
		System.out.println("Initilizerblock");
	}
	

	public static void main(String[] args) 
	{
		//System.out.println("main");
		StaticBlock  c=new StaticBlock();
		StaticBlock c1=new StaticBlock();
		
	}
	
	static               //static block call outside of main method 
	{
		System.out.println("Static blocks defined in outside of main method");
	}
	
	

}
