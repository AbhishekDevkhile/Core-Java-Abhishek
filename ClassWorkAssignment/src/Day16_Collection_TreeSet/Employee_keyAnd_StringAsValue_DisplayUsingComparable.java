package Day16_Collection_TreeSet;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
class Employee implements Comparable<Employee>
{
	int eid;
	String ename;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	@Override
	public int compareTo(Employee o) 
	{
		return this.eid-o.eid;
	}

	
}
public class Employee_keyAnd_StringAsValue_DisplayUsingComparable {

	public static void main(String[] args) {
		
		
		TreeMap<Employee,String>tm=new TreeMap();
		tm.put(new Employee(101,"a"), "Pune");
		tm.put(new Employee(105,"b"), "Nashik");
		tm.put(new Employee(103,"c"), "Mumbai");
		tm.put(new Employee(102,"d"), "Goa");
		
		for(Map.Entry m:tm.entrySet())
		  {    
		       System.out.println(m.getKey()+" "+m.getValue());    
		   }

	}

}

