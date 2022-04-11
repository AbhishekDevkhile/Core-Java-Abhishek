package Day7_Array;
/*12. What is use of variable arguments show with example?*/
public class Program12 
{
	static void show(int ...a)
	{
		System.out.println("int type variable argument:");
		for(int p:a)
		{
			System.out.println(p);
		}
	}
	
	void Details(String ...q)
	{
		System.out.println("String type variable argument:");
		for(String s:q)
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args) 
	{
		//Static method call
		show(1,2,3,4,5,6,7);       
		
		//Details method
		
		Program12 h= new Program12();
		h.Details("Abhishek","Devkhile");
		
		
		

	}

}
