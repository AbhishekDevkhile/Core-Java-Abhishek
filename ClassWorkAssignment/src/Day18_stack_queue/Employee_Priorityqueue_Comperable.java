package Day18_stack_queue;
/*Crete a prority queue is Employee type,and Employee has id,name,Salary.sorting on the basic of empid*/
import java.util.PriorityQueue;

class Employee implements Comparable<Employee>
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
	
	
	//Compareble interface
	
	@Override
	public int compareTo(Employee o) 
	{
		if(this.eid>o.eid)
		{
			return 1;
		}
		else if(this.eid<o.eid)
		{
			return -1;
			
		}
		else
			return 0;
	}
	
}
public class Employee_Priorityqueue_Comperable {

	public static void main(String[] args) {
		PriorityQueue<Employee>pq=new PriorityQueue();
		
		pq.add(new Employee(101,"Abc",23000));
		pq.add(new Employee(106,"Def",89000));
		pq.add(new Employee(103,"Ghi",55000));
		pq.add(new Employee(102,"Jkl",38000));
		pq.add(new Employee(105,"Mno",92000));
		pq.add(new Employee(104,"Pqr",21000));
		
	//	System.out.println(pq);
		for(Employee e:pq)
		{
			System.out.println(e);
		}
		
		System.out.println("////////////////////////////////////////////");
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());               //poll() operation:-remove add retire
		}

	}

}
