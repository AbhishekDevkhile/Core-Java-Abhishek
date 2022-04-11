package day5_Containment;

//Containment using Getter Setter

class Address1
{
	String city;
	
	Address1(String city)
	{
		this.city=city;
	}
	void show()
	{
		System.out.println(city);
	}
	
}

class Student
 {
	int sid;
	String sname;
	Address1 adr;
 
	Student(int sid,String sname,Address1 adr)
   {
		this.sid=sid;
		this.sname=sname;
		this.adr=adr;
	}
	void showDetails()
	{
		System.out.println(sid+ " " +sname);
		adr.show();
	}
	
}
public class Course 
{	
	int cid;
	String cname;
	Student Std;
	
	Course(int cid,String cname,Student Std)
	{
		this.cid=cid;
		this.cname=cname;
		this.Std=Std;
	}
	void cshow()
	{
		System.out.println(cid+" "+cname);
		Std.showDetails();
	}
   	

	public static void main(String[] args) {

		Address1 ad=new Address1("Pune");
		
		Student s=new Student(111, "Abhi", ad);
		
		Course c=new Course(123, "Marathi", s);
		
		c.cshow();

	}

}
