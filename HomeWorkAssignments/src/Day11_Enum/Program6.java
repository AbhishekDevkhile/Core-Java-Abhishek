package Day11_Enum;
/*6. What is boxing and unboxing?*/
public class Program6 {

	public static void main(String[] args) 
	{
		// Boxing

				byte b = 10;
				Byte bobj = new Byte(b); // Boxing
				System.out.println("Byte data boxed::" + bobj);

				int a = 50;
				Integer a2 = new Integer(a);// Boxing
				System.out.println("Integer data boxed:" + a2);

				float f = 50;
				float f1 = new Float(f);// Boxing
				System.out.println("Float data boxed:" + f1);

				// Unboxing
				byte b1 = 50;
				Byte B1 = new Byte(b1); // boxing
				byte b2 = B1.byteValue();// Unboxing
				System.out.println("Float data Unboxed:" + b2);

				// int i=50;
				Integer i = new Integer(50); // boxing
				int i1 = i; // Auto-unboxing
				System.out.println("Integer data Unboxed:" + i1);

				float F = 80;
				Float f3 = new Float(F); // boxing
				float f4 = f3.floatValue();// Unboxing
				System.out.println("Float data Unboxed:" + f4);

	}

}
