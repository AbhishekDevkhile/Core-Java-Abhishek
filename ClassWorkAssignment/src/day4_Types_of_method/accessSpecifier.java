package day4_Types_of_method;

public class accessSpecifier 
{
	private int empid=40;         //Private Access Specifier
	
	public double empSalary=10000;  //public Access Specifier
	
	String empName="Abhishek";    //default access Spceifier
    
	protected long empno=7894561230l;
	
	public static void main(String[] args) 
	{
		accessSpecifier emp=new accessSpecifier();
		
		System.out.println(emp.empid);     //o/p private access Specifier 
		
		System.out.println(emp.empName);    // o/p of default access Specifier 
		
		System.out.println(emp.empSalary);   //o/p of Public access Specifier
	
		System.out.println(emp.empno);      // o/p of Protected Access Specifiers
	}

}
