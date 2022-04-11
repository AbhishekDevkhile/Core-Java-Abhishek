package Day3_ClassAndObject;
/*Add display method inside Student class change values of id, name in that
method & also print the changed values in same method. Call display
method from main method.*/

public class Student4
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
		sid=200;
		sname="Abhi";
		
		
		System.out.println("Student id:"+this.sid);
		System.out.println("Student name:"+this.sname);
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		
		Student4 s2=new Student4();
		
		s2.displayDetails();
		
	}

}

