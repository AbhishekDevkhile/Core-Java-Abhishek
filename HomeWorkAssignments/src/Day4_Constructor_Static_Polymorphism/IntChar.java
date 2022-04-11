package Day4_Constructor_Static_Polymorphism;
/*
  13. Create a class to print an integer and a character 
  with two methods having the same name but different sequence
  of the integer and the character parameters.For example, if the 
  parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).
*/
public class IntChar 
{
	int n;
	char c;
	void method1(char c,int n)
	{
		n=n;
		c=c;
		System.out.println("Sequence of char and int: "+c+" "+n);
	}
	void method1(int n,char c)
	{
		n=n;
		c=c;
		System.out.println("Sequence of int and char: "+n+" "+c);
	}
	/*void show()
	{
		System.out.println(n+" "+c);
	}*/

	public static void main(String[] args) {
		IntChar i=new IntChar();
		i.method1('a', 10);
		i.method1(15,'b');
		

	}

}
