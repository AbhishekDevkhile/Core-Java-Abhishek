package Day12_Collection_ArrayList_ComparatorInterface;
/*Create a ArrayList of Department .Department has id,name,End Employee Object .Employee has id,name,salary.
  sort the Arraylist on the basic of EmpSalary in desecding order using Comparator.*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
{
	int empId;
	String empName;
	int EmpSalary;

	public Employee(int empId, String empName, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		EmpSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", EmpSalary=" + EmpSalary + "]";
	}
}	


	// ComparatorInterface on Employee Salary

	class MyEmpSalary implements Comparator<Department>
	{

		@Override
		public int compare(Department o1, Department o2)
		{
			
			return o2.e.EmpSalary-o1.e.EmpSalary;
		}	
	}	



class Department
{
	int DeptId;
	String DeptName;
	Employee e;
	public Department(int deptId, String deptName, Employee e) {
		super();
		DeptId = deptId;
		DeptName = deptName;
		this.e = e;
	}
	@Override
	public String toString() {
		return "Department [DeptId=" + DeptId+ "   "+ ", DeptName=" + DeptName+"  " + "Emp= "+ e+"  " +"]";
	}	
	
 }
public class Department_ComparatorInterface_sorting {

	public static void main(String[] args) 
	{
		ArrayList<Department> al=new ArrayList();
		al.add(new Department(101,"R&D",new Employee(111,"Abhishek",890000)));
		al.add(new Department(102,"HR",new Employee(112,"Abhishek",810000)));
		al.add(new Department(103,"Main",new Employee(113,"Abhishek",490000)));
		al.add(new Department(104,"BMS",new Employee(114,"Abhishek",990000)));
		
		Collections.sort(al,new MyEmpSalary());
		
		System.out.println("//////////Sorting on the basic of Employee Salary///////////");
		for(Department d:al)
		{
			System.out.println(d);
		}
	}

}
