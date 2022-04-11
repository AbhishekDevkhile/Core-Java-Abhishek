package JavaTest2;
class Car 
{
String name;
static String color = "White";
}

public class Demo {
	
		public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "Blue";
		Car c2=new Car();
		changeColor(c1);
		c2.color="Pink";
		System.out.println(c1.color);
		System.out.println(c2.color);
		}
		public static void changeColor(Car c1) {

		c1.color = "Yellow";
		}
		}
		

	

