package Day12_Collection_ArrayListInsideArrayList;
/*Create Arraylist of employee.Employee has Eid,name And Department id .Create another
 Arraylist of Department.Department has id,name.take a String type of input 
 from user for the Department nameAnd Display all the Employee name From that Department.  */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Department
{
	int deptid;
	String deptName;
	public Department(int deptid, String deptName) 
	{
		super();
		this.deptid = deptid;
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptName=" + deptName + "]";
	}
	
}
class Employee
{
	int eid;
	String ename;
	int d;
	public Employee(int eid, String ename, int d) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.d = d;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", d=" + d + "]";
	}
	
	
}
public class DisplayUsingUserInput_DepatmentAneEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee> e=new ArrayList();
		for(int i=0;i<=2;i++)
		{
			System.out.println("Enter Emp Id:");
			int eid=sc.nextInt();
			System.out.println("Enter Emp Name:");
			String enm=sc.next();
			System.out.println("Enter Employee Dept Id:");
			int edid=sc.nextInt();
			
			e.add(new Employee(eid,enm,edid));
		}
		
		ArrayList<Department> d=new ArrayList();
		for(int i=0;i<=2;i++)
		{
			System.out.println("Enter Dept Id:");
			int did=sc.nextInt();
			System.out.println("Enter Dept Name:" );
			String dnm=sc.next();
			d.add(new Department(did,dnm));
			
		}
		
		System.out.println("Enetr Depatment name:");
		String dname=sc.next();
		
		
		//way1
		int p=0;
		for(int i=0;i<d.size();i++)
		{
			if(d.get(i).deptName.equals(dname))
			{
				p=d.get(i).deptid;
			}
		}
		for(int i=0;i<e.size();i++)
		{
			if(e.get(i).eid==p)
			{
				System.out.println(e.get(i).ename);
			}
		}
		
		//Way 2
		
		Iterator<Department>itr=d.iterator();
		
		while(itr.hasNext());
		{
			Department dt=itr.next();
			if(dt.deptName.equals(dname))
			{
				int deptid=dt.deptid;
				Iterator<Employee> it2=e.iterator();
				while(it2.hasNext())
				{
					Employee e1=it2.next();
					if(e1.eid==deptid)
					{
						System.out.println(e1.ename);
					}
				}
			}
		}
	
	}

}
