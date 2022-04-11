package Day16_Collection_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee
{
	int eid;
	String ename;
	int esalary;
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
}
public class Employee_displaySalaryMoreThan25k {

	public static void main(String[] args) {
		Set<Employee> s=new HashSet();
		
		s.add(new Employee(101,"Abc",25000));
		s.add(new Employee(102,"Def",15000));
		s.add(new Employee(103,"Ghi",26000));
		s.add(new Employee(104,"Jkl",95000));
		s.add(new Employee(105,"Mno",10000));
		s.add(new Employee(106,"Pqr",66000));
		s.add(new Employee(107,"Stu",9000));
		
		Iterator<Employee>itr=s.iterator();
		while(itr.hasNext())
		{
			Employee e=itr.next();
			if(e.esalary>25000)
			{
				System.out.println(e);
			}
		}
		

	}

}
