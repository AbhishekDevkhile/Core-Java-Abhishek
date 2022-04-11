package day4_ClassAndObjects;

public class Employee 
	{
	 	String empName;
	 	int empId;
	 	int empCont;
	 	float empSalary;
	 	
	 	
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.empName = "Abhi";
		emp.empId=123;
		emp.empCont=5;
		emp.empSalary=12545.00f;
		System.out.println(emp.empName+" "+emp.empId+" "+emp.empCont+" "+emp.empSalary);
	    
		Employee emp1 = new Employee();
		emp1.empName = "Abhishek";
		emp1.empId=456;
		emp1.empCont=5;
		emp1.empSalary=120000.00f;
		System.out.println(emp1.empName+" "+emp1.empId+" "+emp1.empCont+" "+emp1.empSalary);
		
		Employee emp2 = new Employee();
		emp2.empName = "Chaitanya";
		emp2.empId=789;
		emp2.empCont=6;
		emp2.empSalary=130000.00f;
		System.out.println(emp2.empName+" "+emp2.empId+" "+emp2.empCont+" "+emp2.empSalary);
		
		Employee emp3 = new Employee();
		emp3.empName = "Nainesh";
		emp3.empId=147;
		emp3.empCont=6;
		emp3.empSalary=14000.00f;
		System.out.println(emp3.empName+" "+emp3.empId+" "+emp3.empCont+" "+emp3.empSalary);
	
	}

}
