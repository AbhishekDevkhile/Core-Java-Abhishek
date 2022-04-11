package Day16_Collection_LinkedHashMap;
/*If map contain custom type of key then override the hash code and equal method in custom object*/
import java.util.LinkedHashMap;
import java.util.Map;

class Employee
{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	} 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public int hashCode()
	{
		return id;
	}
	@Override
	public boolean equals(Object o)
		{
			Employee e=(Employee) o;
			
			if(this.id==e.id)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
}
	

public class ConpareEmployee_HashcodeEqualmethod_Override {
	

	public static void main(String[] args) 
	{
		LinkedHashMap<Employee,String>hm=new LinkedHashMap();
		hm.put(new Employee(101,"amit",78000), "Pune");
		hm.put(new Employee(105,"Rohit",85000), "Mumbai");
		hm.put(new Employee(105,"Nitin",85000), "Mumbai");
		hm.put(new Employee(109,"Abhi",79000), "Nashik");
		hm.put(new Employee(104,"Virat",55000), "Banglor");
		
		
		for(Map.Entry<Employee, String>m:hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}

	}

}
