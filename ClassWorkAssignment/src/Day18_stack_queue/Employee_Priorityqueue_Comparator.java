package Day18_stack_queue;
/*
 Crete a prority queue is Employee type,and Employee has id,name,Salary .om employeee class the basic of salary in descending
 order and add one by one employee in treeset and display only employee who got max.salary and min salary.
 */
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

class Emp

{
	int eid;
	String eName;
	int eSalary;
	
	public Emp(int eid, String eName, int eSalary) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
}

class myCom implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o2.eSalary-o1.eSalary;
	}
	
	
}

public class Employee_Priorityqueue_Comparator {

	public static void main(String[] args) {
		PriorityQueue<Emp>pq=new PriorityQueue(new myCom());
		
		pq.add(new Emp(101,"Abc",23000));
		pq.add(new Emp(106,"Def",89000));
		pq.add(new Emp(103,"Ghi",55000));
		pq.add(new Emp(102,"Jkl",38000));
		pq.add(new Emp(105,"Mno",92000));
		pq.add(new Emp(104,"Pqr",21000));
		
	//	System.out.println(pq);
		for(Emp e:pq)
		{
			System.out.println(e);
		}
		
		System.out.println("////////////////////////////////////////////");
		
		
		TreeSet<Emp> ts=new TreeSet(new myCom());
//		
//		for(Emp emp:ts)
//		{
//			System.out.println(emp);
//		}
		
		
		while(!pq.isEmpty())
		{
			//System.out.println(pq.poll());              //poll() operation:-remove add retire
			ts.add(pq.poll());
		}
		
		
		System.out.println("Top element:"+ts.first());
		System.out.println("Bottom element:"+ts.last());
		

	}

}
