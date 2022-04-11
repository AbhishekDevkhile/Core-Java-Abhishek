package Day3_ClassAndObject;

public class ArithmeticOperations {
	
	public int addition(int a,int b)
	{
		int c =a+b;
		return c;
	}
	public float Subtraction(int a,float b)
	{
		float c =a-b;
		return c;
	}
	public float Multiplication(float a,float b)
	{
		float c =a*b;
		return c;
	}
	public float Division(int a,int b)
	{
		float c =a/b;
		return c;
	}

	public static void main(String[] args) {
		ArithmeticOperations a=new ArithmeticOperations();
		//a.addition(100, 200);
		System.out.println("Addition is:"+a.addition(100,200));
		System.out.println("Subtraction is:"+a.Subtraction(50,30.02f));
		System.out.println("Multiplication is:"+a.Multiplication(5f,15f));
		System.out.println("Division is:"+a.Division(50,5));
 
	}

}
