package day4_Types_of_method;

public class MethodDemo {
	int c;
//A) No return type no parameter
	
	public void show()
	{
		System.out.println("Execute method");
	}
	
//B)No return type with parameter
	
	public void addition(int a,int b)
	{
		c=a+b;
	}
	
	public void display()
	{
		System.out.println(c);
	}
	
// C) With return type no parameter
	
	public int calculate()
	{
		int x=c*c;
		return x;
	}
	
//D)with return type and parameters
	
	public float area(int r, float pi)
	{
		float f =pi*r*r;
		return f;
	}
	

	public static void main(String[] args) 
	{
	MethodDemo m=new MethodDemo();          //create class  object
	
	m.show();                                //A method display procedure
	
	m.addition(10,20);                        //B method display procedure
	m.display();
	
	int ans=m.calculate();                    //C method display procedure
	System.out.println(ans);
	        //OR
	System.out.println(m.calculate());
	
	
	System.out.println(m.area(ans, 4.13f));   //D method display procedure

	}

}
