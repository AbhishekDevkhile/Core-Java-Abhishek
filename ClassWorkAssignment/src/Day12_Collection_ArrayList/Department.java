package Day12_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Emp
{
	int id;
	String name;
	int did;
	public Emp(int id, String name, int did) {
		super();
		this.id = id;
		this.name = name;
		this.did = did;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", did=" + did + "]";
	}
	
	
}

public class Department {
	
	int deptid;
	String dname;
	
	

	public Department(int deptid, String dname) {
		super();
		this.deptid = deptid;
		this.dname = dname;
	}



	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + "]";
	}



	public static void main(String[] args) {
		
		ArrayList<Department>d=new ArrayList();
		d.add(new Department(10,"Sales"));
		d.add(new Department(20,"HR"));
		d.add(new Department(30,"Admin"));
		
		ArrayList<Emp>e=new ArrayList();
		
		e.add(new Emp(1,"Amit",30));
		e.add(new Emp(2,"Nitin",10));
		e.add(new Emp(3,"Komal",10));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter department name");
		String dn=sc.next();
		
		
		int dtid=0;                       //initization local variable
		
		for(Department d2:d)                           //check on department arraylist
		{
			if(d2.dname.equalsIgnoreCase(dn))            //check dname equal to dn
			{
				dtid=d2.deptid;                          //if same then store in dtid
			}
		}
		
		System.out.println(dtid);
		
		for(Emp e2:e)                                         //Check on employee Arraylist
		{
			if(e2.did==dtid)                                 //if did is same as dtid
			{
				System.out.println(e2);                              //display
			}
		}
		
		
	}

}
