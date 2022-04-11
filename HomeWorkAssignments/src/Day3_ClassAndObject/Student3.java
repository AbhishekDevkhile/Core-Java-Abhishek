package Day3_ClassAndObject;

public class Student3
{
	int sid=123;
	String sname="Abhi";
	String cname="SRTTC";
	
	void showDetails()
	{
		System.out.println("Student id:"+sid);
		System.out.println("Student name: "+sname);
	}
	
	void acceptDetails(int id,String sname)
	{
		this.sid=id;
		this.sname=sname;
		
	}
	void displayDetails()
	{
	
		
		this.sid=getId();
		System.out.println("New Student id:"+this.sid);
		System.out.println("New Student name:"+this.sname);
		
	}
	
	int getId()
	{
		
		return 100;
	}
	
	
	
	void Display()
	{
		System.out.println("Student id:"+sid);
		System.out.println("Student name: "+sname);
	}
	
	

	public static void main(String[] args) {
		
		Student3 s1=new Student3();
		s1.showDetails();
		Student3 s2=new Student3();
		s2.acceptDetails(456,"Nainesh");
		s2.displayDetails();
		
		s2.Display();
		
	}

}

