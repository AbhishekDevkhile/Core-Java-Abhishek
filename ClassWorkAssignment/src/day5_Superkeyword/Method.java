package day5_Superkeyword;

//Super keyword using method call

class Parent1
{
	public void input()
	{
		System.out.println("Parent class method");
	}
	
}
public class Method extends Parent1 {
	
	public void input()
	{
		System.out.println("Child class method");
	}
	void show()
	{
		super.input();
	
	}

	public static void main(String[] args) {
		Method  m=new Method();
		m.input();
		m.show();

	}

}
