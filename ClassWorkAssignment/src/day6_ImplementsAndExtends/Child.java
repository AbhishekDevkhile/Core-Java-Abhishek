package day6_ImplementsAndExtends;
interface Parent1
{
	void Details();
}
interface Parent2 extends Parent1    //inherit first interface into second interface
{
	void show();
}

public class Child implements Parent2   //inherit Second interface into child class
{
	public void Details()                 //method implementation
	{
		System.out.println("Implemetation of first interface ");
	}
	
	public void show()
	{
		System.out.println("Implemetation of Second interface");
	}
	

	public static void main(String[] args) {

		Child c=new Child();
		
		c.Details();
		c.show();

	}

}
