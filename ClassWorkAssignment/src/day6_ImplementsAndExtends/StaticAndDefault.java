package day6_ImplementsAndExtends;

interface Demo
{
	void show();
	
	default void method1()
	{
		System.out.println("Default method call");
	}
	static void method2(int id,String name)
	{
		System.out.println(id+" "+name);
	}
}
public class StaticAndDefault implements Demo 
{
	public void show()
	{
		System.out.println("Show method call");
	}
	

	public static void main(String[] args) {
		StaticAndDefault a=new StaticAndDefault();
		Demo.method2(123,"Abhi");
		a.method1();
		a.show();


	}

	

}
