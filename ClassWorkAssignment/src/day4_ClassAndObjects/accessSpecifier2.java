package day4_ClassAndObjects;

import day4_Types_of_method.accessSpecifier;

public class accessSpecifier2 extends accessSpecifier 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Access Protected Specifiers or variables using inheritance Concept in different package");
		accessSpecifier2 emp3 =new accessSpecifier2();
		
		accessSpecifier emp4 =new accessSpecifier();
		
	//	System.out.println(emp4.empid);     // do not access private access Specifier on another package
		
	//  System.out.println(emp4.empName);    // do not access default access Specifier on another package(less visibility)
				
		System.out.println(emp3.empSalary);   //O/p of public access specifiers
		
		System.out.println(emp3.empno);       //Access Protected Specifiers on another packages (using extend class)

	}

}
