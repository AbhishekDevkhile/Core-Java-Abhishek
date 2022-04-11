package day6_ImplementsAndExtends;
interface First              //First interface
{
	void show();             //Abstract method
}
interface Second             //Second interface
{
	void display();          //Abstract method
}

public class InterfaceAbstract implements First,Second     //both interface in one class
{
	public void show()                 
	{
		System.out.println("first Interface class");
	}
	public void display()
	{
		System.out.println("Second interface class");
	}

	public static void main(String[] args) {
		InterfaceAbstract ia=new InterfaceAbstract();      //create object of child class
		ia.show();                               //call first interface method
		ia.display();

	}

}
