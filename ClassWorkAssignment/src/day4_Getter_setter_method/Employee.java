package day4_Getter_setter_method;

public class Employee {
	
	     private int empId;
	     private String empName;
	     private float empSalary;
	     
	     
	     public int getempId()
	     {
	    	 return empId;
	     }
	     
	     public void setempId(int id)
	     {
	      	 empId=id;
	     }
	     public String getempName()
	     {
	    	 return empName;
	     }
	     
	     public void setempName(String Name)
	     {
	    	 empName=Name;
	     }
	     
	 	public static void main(String[] args) 
	 	{
	 		Employee emp=new Employee();
	 		
	 		emp.setempId(123);
	 		System.out.println("EmpId is"+emp.getempId());

	 		emp.setempName("Abhishek");
	 		System.out.println("Employee Name is:"+emp.getempName());
	 		
	 		
	 		
	 	}

}
