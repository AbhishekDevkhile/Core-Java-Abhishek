package day4_Types_of_method;

public class accessSpecifier1 {

	public static void main(String[] args) {
		System.out.println("Try to accept variable From different class like class accrccSpecifier in same package");
		
		
		accessSpecifier emp1=new accessSpecifier();
		
		

		//System.out.println(emp1.empid);     // do not acccess private access Specifier 
		
		System.out.println(emp1.empName);    // o/p of default access Specifier 
		
		System.out.println(emp1.empSalary);   //o/p of Public access Specifier
	
		System.out.println(emp1.empno);       // o/p of protected access specifiers
	}
	

}
