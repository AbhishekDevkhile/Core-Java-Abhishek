 package day4_StaticVariableOrMethod;

public class Employee {
	int empid;
	String empname;
	static String cname="NIC";         //Static variable
	
	void acceptDetails()
	{
		empid=123;
		empname="Chaitanya";
	}
	static void acceptDetails1()       //Static method Declared 
	{
		Employee e=new Employee();
		e.empid=456;
		e.empname="Siddhant";
		e.show();                //show method call 
	}
	void show()
	{
		System.out.println("Employee id="+empid+"  "+"Employee name="+empname+"  "+"Employee company="+cname);
	}

	public static void main(String[] args) {
		
		Employee e1=new Employee();
	
		e1.acceptDetails();               
		e1.show();
		
		acceptDetails1();                  //Static method input acceptance
		

	}

}
