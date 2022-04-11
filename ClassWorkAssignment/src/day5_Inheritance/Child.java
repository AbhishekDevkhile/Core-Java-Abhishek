package day5_Inheritance;
class Parent
{
	int x=10;
	Parent(int x)
	{
		System.out.println("Parent Constructor");
	}
	public void input()
	{
		System.out.println("Parent");
	}
	
}

public class Child extends Parent {
	int x=30;
	Child()
	{
		super(34);
		System.out.println("Child Construtor");
	}
	void show()
	{
		System.out.println(x+" "+super.x);
		super.input();
	}
public void input()
	{
	
		System.out.println("child");
		
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.show();
		c.input();

	}

}
