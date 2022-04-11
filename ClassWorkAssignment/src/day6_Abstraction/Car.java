package day6_Abstraction;

abstract class Vehicle
{
	int vid;
	String vcolor;
	Vehicle(int v,String c)
	{
		vid=v;
		vcolor=c;
		System.out.println("Parent constructor");
	}
	
	
	abstract void Details();
	
	 
	void show()
	{
		System.out.println("id is : "+vid);
		System.out.println("color is: "+vcolor);
	}
}

public class Car extends Vehicle 
{
	Car()
	{
		super(123,"asd");         
	}
	
	void Details()
	{
		System.out.println("Abstract method");
	}

	public static void main(String[] args) {
		Car c=new Car();
		c.Details();
		
		c.show();

	}

}
