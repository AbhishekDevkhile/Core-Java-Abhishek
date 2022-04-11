package Day5_Inheritance_And_Polymorphism;
/*
4. Create a class with display() method that prints "This is parent class" 
and its subclass with another view() method that prints "This is child class". 
Now, create an object for each of the class and call 
1 - method of parent class by object of parent class 
2 - method of child class by object of child class 
3 - method of parent class by object of child class

5. In the above example, declare the method of the parent class as private 
and then repeat the first two operations 
(You will get error in the third).
*/

class Parent
{	
	void Display()
	{
		System.out.println("This is Parent class");
	}
}
public class Child extends Parent {
	void show()
	{
		
		System.out.println("This is Child class");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.show();
		
		Parent p=new Parent();
		p.Display();
		
		p=new Child();
		p.Display();

	}

}
