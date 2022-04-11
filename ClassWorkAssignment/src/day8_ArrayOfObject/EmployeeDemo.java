package day8_ArrayOfObject;
/*Using hardcode value*/

public class EmployeeDemo {
	int id;
	String name;
	int salary;
	
	EmployeeDemo(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println(id+"  "+name+"  "+salary);
	}
	

	public static void main(String[] args) {
		
		EmployeeDemo e[]=new EmployeeDemo[3];
		e[0]=new EmployeeDemo(1,"Abc",123);
		e[1]=new EmployeeDemo(2,"Def",456);
		e[2]=new EmployeeDemo(3,"Ghi",789);
		
		e[0].display();
		e[1].display();
		e[2].display();
	}

}
