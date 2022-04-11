package day4_Polymorphim_MethodOverloading;

public class MethodOverloading {
	
	void sum(int x,int y,int z)
	{
		int c=x+y+z;
		System.out.println(c);
		
	}
	void sum(int x,float y)
	{
		//MethodOverloading m=new MethodOverloading();
		float c=x-y;
		System.out.println(c);
		show("Abhishek");           //static show method call
	}
	static void show(float x,float y)
	{
		float c=x*y;
		System.out.println(c);
		
	}
	static void show(String  a)
	{
		System.out.println(a);
		
	}
	

	public static void main(String[] args) {
		
		MethodOverloading m=new MethodOverloading();
		m.sum(10,20,30);
		m.sum(50,20.5f);
		
		show(20f,10f);



	}

}
