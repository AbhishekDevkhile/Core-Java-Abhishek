package Day3_ClassAndObject;

public class Student
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
		System.out.println("Student id:"+this.sid);
		System.out.println("Student name:"+this.sname);
		
		//Call one method to another call
		getId();
	}
	
	void getId()
	{
		System.out.println("College name:"+cname);
	}
	
	

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.showDetails();
		
		Student s2=new Student();
		s2.acceptDetails(456,"Nainesh");
		s2.displayDetails();
		
	}

}
