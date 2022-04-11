package Day6_AbstractClassAnd_Interface;
/*1. What is the output of following code*/

/*
	class Base 
	{
		public final void show() 
		{
			System.out.println("Base::show() called");
		}
	}
	class Derived extends Base {
		public void show()         //Cannot override the final method from Base
		{
			System.out.println("Derived::show() called");
		}
	}
	public class Program1 
	{
		public static void main(String[] args) 
		{
			Base b = new Derived();;
			b.show();
		}
	}
*/