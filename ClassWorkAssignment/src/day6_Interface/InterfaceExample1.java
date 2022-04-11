package day6_Interface;

interface Moveable
{
	int speed=100;
	void move(int s);       //abstract method
	

}

class Car implements Moveable
{
	public void move(int s)
	{
	
		System.out.println("Car is moving with speed "+s+" km/hr"+"End speed is"+speed);
	}
	
	
}
public class InterfaceExample1 {

	public static void main(String[] args) {

		Car c=new Car();
		c.move(15);
	}

}
