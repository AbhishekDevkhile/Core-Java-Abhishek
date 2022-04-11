package Day5_Inheritance_And_Polymorphism;
/*
 2. Create Employee class which has attributes (id, name, salary, dept, mydate) 
 Where dept and mydate is class, dept has (dept_id, dept_name) 
 And mydate has (day, month, year) Display Employee information
(Note - Containment using constructor and getter/setter).*/
class Mydate
{
	int day;
	int month;
	int year;
	public void setDay(int day)
	{
		this.day=day;
	}
	public void setMonth(int month)
	{
		this.month=month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	
}
class Department1
{
	int deptid;
	String deptName;
	public void setDeptId(int deptid)
	{
		this.deptid=deptid;
	}
	public void setDeptName(String deptname)
	{
		this.deptName=deptname;
	}
	public int getDeptId()
	{
		return deptid;
	}
	public String getDeptName()
	{
		return deptName;
	}
}
public class Employee {
	int id;
	String name;
	double salary;
	Department1 dept;
	Mydate date;
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void setDepartment1(Department1 dept)
	{
		this.dept=dept;
	}
	public void setMyDate(Mydate date)
	{
		this.date=date;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public Department1 getDepartment1()
	{
		return dept;
	}
	public Mydate getMyDate()
	{
		return date;
	}
	
	public static void main(String[] args) {
		Department1 d=new Department1();
		d.setDeptId(123);
		d.setDeptName("Computer");
		
		Mydate m=new Mydate();
		m.setDay(14);
		m.setMonth(11);
		m.setYear(2022);
		
		Employee e=new Employee();
		e.setId(11111);
		e.setName("Abhishek");
		e.setSalary(60000);
		e.setDepartment1(d);
		e.setMyDate(m);
		
		System.out.println("Emp id: "+e.getId()+"  "+"Emp name: "+e.getName()+"  "+"Emp Salary: "+e.getSalary());
		System.out.println("Emp DeptId: "+d.getDeptId()+"  "+"Emp DeptName: "+d.getDeptName());
		System.out.println("Date: "+m.getDay()+"/"+m.getMonth()+"/"+m.getYear());
		

	}

}
