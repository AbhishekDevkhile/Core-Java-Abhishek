
package day5_Superkeyword;
//Super keyword in constructor

class Parent2
   {
	Parent2()            //default constructor
	{
		System.out.println("Parent class constructor");
	}
	
	Parent2(int x)
	{
		this();
		System.out.println("arg constructor of child class");
	}
	}
public class Constructor extends Parent2
{
	Constructor()
	{
		
		super(30); 
		//super();//parent class constructor call 
		System.out.println("Child class constructor");
		
	}
	void show()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Constructor c=new Constructor();
		c.show();

	}

}
