package Day3_ClassAndObject;

/*Create getId() method in Student class. call getId() method from
displayData method so that you know that one method can be called from
another method. Return id from getId() method and set that id to the
instance variable in displayData method.*/

public class Student1
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
	
		//call getId() method from displayData method
		this.sid=getId();
		
		System.out.println("Student id:"+this.sid);
		System.out.println("Student name:"+this.sname);
		
	}
		
	//Create getId() method in Student class.
	int getId()
	{
		return 100;
	}
	

	public static void main(String[] args) {
		
		//Student1 s1=new Student1();
		//s1.showDetails();
		Student1 s2=new Student1();
		//s2.acceptDetails(456,"Nainesh");
		s2.displayDetails();
		
	}

}
