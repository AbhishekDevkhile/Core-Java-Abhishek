package day5_Containment;

          //Containment using constructor 

class Department
	{
	int did;
	String dname;
	

	Department(int did,String dname)
	{
		this.did=did;
		this.dname=dname;	
	}
	void showDetails()
	{
		
		System.out.println("Dept id ="+did+" "+"Dept name="+dname);
	}
}
public class Employee 
{
	
	int id;
	String name;
	Department dept;
	
	Employee(int id,String name,Department dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	
	void show()
	{
		System.out.println("Emp id="+id + " "+"Emp Name=" +name);
		dept.showDetails();
	}
	
	public static void main(String[] args) {
	
		Department d=new Department(1,"Sales");
		Employee e=new Employee(101,"Amit",d);
		e.show();
		
		            //OR
	//	Employee e1=new Employee(200,"Abhi",new Department(1,"HR"));
	//	e.show();
	}

}
