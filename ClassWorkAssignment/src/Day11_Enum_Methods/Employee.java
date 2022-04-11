package Day11_Enum_Methods;

import java.util.Scanner;



public class Employee {
	int empid;
	String name;
	Role roletype;
	

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", roletype=" + roletype + "]";
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee();
		
		System.out.println("Enter employee name: ");
		e1.name=sc.next();
		
		System.out.println("***List of Roles***");
		Role[] arr=Role.values();                         //value():convert array
		for(Role r:arr)
		{
			System.out.println(r);
		}
		System.out.println("Enter your choice foe role:");
		String s=sc.next().toUpperCase();
		e1.roletype=Role.valueOf(s);
		System.out.println(e1);
		
	}

}
