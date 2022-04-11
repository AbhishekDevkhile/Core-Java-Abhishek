package Day3_ClassAndObject;
/*5. Write a program to copy values of one object into another by assigning the
values of one object into another.*/

public class CopyObject {
	int id;
	String name;
	
	public void enterDetails(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void showdetails()
	{
		System.out.println(id+"  "+name);
	}

	public static void main(String[] args) {
		CopyObject o=new CopyObject();
		CopyObject o1=new CopyObject();
		o=o1;
		o.enterDetails(123, "Abhishek");
		o.showdetails();
		o1.showdetails();

	}

}
