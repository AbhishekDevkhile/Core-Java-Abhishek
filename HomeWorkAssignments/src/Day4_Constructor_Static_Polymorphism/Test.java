package Day4_Constructor_Static_Polymorphism;
//14. What is the output of the following program?

public class Test
{
	public int getData()
	{
		return 0;
	}
//	public long getData()     //Duplicate method getData() in type Test
//	{
//		return 1;
//	}
	public static void main(String[] args)
	{
		Test obj = new Test();
		System.out.println(obj.getData());
	}
}
