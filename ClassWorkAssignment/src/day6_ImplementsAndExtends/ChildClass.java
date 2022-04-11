package day6_ImplementsAndExtends;

interface FirstInterface
{
	void show();
}
abstract class FirstAbstractclass implements FirstInterface
{
	abstract void Details();
	
	public void show()
	{
		System.out.println("Implements interface method");
	}
	
}

public class ChildClass extends FirstAbstractclass  {

	/*	public void show()
	{
		System.out.println("Implements interface method");
	}   */
	
	public void Details()
	{
		System.out.println("Implements Abstract method");
	}

	public static void main(String[] args) {
		ChildClass c=new ChildClass();
		c.Details();
		c.show();

	}

}
