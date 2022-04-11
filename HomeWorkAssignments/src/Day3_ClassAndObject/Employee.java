package Day3_ClassAndObject;

public class Employee {

	private int eid;
	private String ename;
	private double esalary;
	
	void seteId(int eid)
	{
		this.eid=eid;
	}
	void seteName(String ename)
	{
		this.ename=ename;
	}
	void seteSalary(double esalary)
	{
		this.esalary=esalary;
	}
	int geteId()
	{
		return eid;
	}
	String geteName()
	{
		return ename;
	}
	double geteSalary()
	{
		return esalary;
	}

	public static void main(String[] args) {

		Employee e=new Employee();
		e.seteId(0123);
		e.seteName("Abhi");
		e.seteSalary(1233456);
		
		System.out.println(e.geteId());
		System.out.println(e.geteName());
		System.out.println(e.geteSalary());

	}

}
