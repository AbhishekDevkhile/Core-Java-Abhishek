package Day5_Inheritance_And_Polymorphism;
/*
1. WAP to have Student class has roll, name and Department 
object should have id and name. Assign and print individual 
values in main method
(Note - Containment using constructor and getter/setter).
  */
class Department
{
	int id;
	String name;
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
}
public class Student {
	int rollNo;
	String name;
	Department dept;
	public void setRollNo(int rNo)
	{
		this.rollNo=rNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDepartment(Department dept)
	{
		this.dept=dept;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public String getName()
	{
		return name;
	}
	public Department getDepartment()
	{
		return dept;
	}
	
	
	public static void main(String[] args) {
		Department d=new Department();
		d.setId(8888);
		d.setName("Mech");
		Student s=new Student();
		s.setRollNo(0123);
		s.setName("Shyam");
		s.setDepartment(d);
		
		System.out.println("Department Id:"+d.getId()+" "+"Department name: "+d.getName());
		System.out.println("Student rollno: "
				+ ""+s.getRollNo()+" "+"Student number: "+s.getName());
		}

}
