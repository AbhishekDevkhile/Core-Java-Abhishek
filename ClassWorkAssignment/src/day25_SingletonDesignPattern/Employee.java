package day25_SingletonDesignPattern;
/*singletonDesign Pattern*/


public class Employee {
	private int empid;
	private String ename;
	
	private static Employee eobj;
	
	private Employee()
	{
		
	}
	
	
	public static Employee getInstance()
	{
		if(eobj==null)
		{
			eobj=new Employee();
		}
		return eobj; 
	}
	
	public static void main(String[] args) {
		

	}

}
