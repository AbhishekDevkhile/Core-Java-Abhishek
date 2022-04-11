package day4_Polymorphim_MethodOverloading;

public class Calculator 
{
	int x=50;
	int y=150;
	
	void calculate(int a,int b,float c)
	{
		System.out.println("Addition(int,int,float):"+(a+b+c));
	}
	
	void calculate(int a,float b)
	{
		System.out.println("Subtraction(int,float):"+(a-b));
	}
	
	void calculate(float a,float b)
	{
		System.out.println("Multiplication(float,float):"+(a*b));
	}
	
//	void calculate(int x, int y)
//	{
//		this.x=x;
//		this.y=y;
//		System.out.println("Addition(int,int):"+(x+y));
//	}
	
	void calculate()
	{
		int a=10;
		float b=20f;
		float c=30.00f;
		System.out.println(a+b+c);
		System.out.println(x+y);
	}
	
	void calculate(String a)
	{
		System.out.println("Print String:"+a);
	}

	public static void main(String[] args) 
	{
		Calculator c =new Calculator();
		c.calculate(10, 20, 30.00f);      //int,int,float
		
		c.calculate(10, 5.04f);           //int,float
		
		c.calculate(10.00f,15.00f);        //float,float
		
		
		
		//c.calculate(10,20);                    //int,int
		
		c.calculate();                  //int,float,float
		
		c.calculate("abc");        //string
	}

}
