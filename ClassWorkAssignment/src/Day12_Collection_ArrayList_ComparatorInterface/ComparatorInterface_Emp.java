package Day12_Collection_ArrayList_ComparatorInterface;
//Comparator Interface in java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorInterface_Emp {
	int id;
	String name;
	int salary;


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public ComparatorInterface_Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public static void main(String[] args) 
	{		
		ArrayList<ComparatorInterface_Emp>al=new ArrayList();
		al.add(new ComparatorInterface_Emp(200,"a",89000));
		al.add(new ComparatorInterface_Emp(145,"b",56000));
		al.add(new ComparatorInterface_Emp(300,"a1",90000));
	
		for(ComparatorInterface_Emp e:al)
		{
			System.out.println(e);
		}
		
		
		
		Collections.sort(al,new MyComSalary());
		
		System.out.println("/////////Sorting on the basic of Employee Salary///////");
		for(ComparatorInterface_Emp e:al)
		{
			System.out.println(e);
		}
				
		Collections.sort(al,new MyComName());
		
		System.out.println("//////////Sorting on the basic of Employee name///////////");
		for(ComparatorInterface_Emp e:al)
		{
			System.out.println(e);
		}
		
	}

}


class MyComSalary implements Comparator<ComparatorInterface_Emp>{

	@Override
	public int compare(ComparatorInterface_Emp o1, ComparatorInterface_Emp o2) {
		
		return o1.salary-o2.salary;
	}
	
}

class MyComName implements Comparator<ComparatorInterface_Emp>
{

	@Override
	public int compare(ComparatorInterface_Emp o1, ComparatorInterface_Emp o2)  
	{
		return o2.name.compareTo(o1.name);
	}
	
}


