package day5_CovariantReturnType;

class Animal
{
	      /*
	Vehical show()
	{
		Vehical v=new Vehical();
		return v;
	}        */
	            
	Number show()
	{
		
		return 100.78;
	}
	              
	
//	Object show()
//	{
//		String s=new String("Hiiii");
//		return s;
//	}
	
	
}
class Dog extends Animal
{       /*
	Car show()
	{
		return new Car();
	}      */
	
	        
	Integer show()

	{
		return 23;
	}
	            
//	String show()
//	{
//		return "Hello";
//	}
}


public class Covariant {
	int x=10;
	
	public String toString()
	{
		return "x="+x;
	}
	

	public static void main(String[] args) {
	
		Covariant c=new Covariant();
		
		System.out.println(c);
		
		

	}

}
