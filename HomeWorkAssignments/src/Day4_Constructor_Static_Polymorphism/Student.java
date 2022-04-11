package Day4_Constructor_Static_Polymorphism;
/*
 12. Create a class 'Student' with three data members which are name, age and
address. It has two methods with the same name set_Info(). First method
has two parameters for name and age and assigns the same whereas the
second method takes has three parameters which are assigned to name,
age and address respectively. Print the name, age and address.*/

public class Student {
	String name;
	int age; 
	String Address;
	
	void set_info(String name,int age)
	{
		this.name=name;
		this.age=age;
		showDetails();
	}
	void set_info(String name,int age,String Address)
	{
		this.name=name;
		this.age=age;
		this.Address=Address;
		showDetails();
	}
	void showDetails()
	{
		System.out.println("Student name: "+name+"  "+"Student age: "+age+"  "+"Student Address: "+Address);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.set_info("Abhishek",23);
		s.set_info("Chaitanya", 20,"Pune");
		//s.showDetails();

	}

}
