package day7_Array_varArgument;
/*Demo of variable argument*/
public class VariableArgDemo 
{
	static void show(String s,int ...a)
	{
		System.out.println("____________");
		for(int p:a)
		{
			System.out.println(p);
		}
	}
	
	void Details(String ...n)
	{
		System.out.println("*********************");
		for(String r:n)
		{
			System.out.println(r);
		}
	}
	
	public static void main(String[] args) 
	{
		show("a",1,2,3);
		show("b",8,6,3,4);
		
		
		VariableArgDemo v=new VariableArgDemo();
		v.Details("Abhi","Devkhile");
		

	}

}
