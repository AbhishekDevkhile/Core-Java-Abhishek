package day6_Abstraction;

abstract class College
{
	abstract void acceptdetails();

}

abstract class Depatment extends College
{
	abstract void accept();
		
}
public class Student extends Depatment{
	
	void accept()
	{
		System.out.println("Abstract class College  ");
	}
	void acceptdetails()
	{
		System.out.println("Abstract class Department");
	}
	

	public static void main(String[] args) {

		Student s=new Student();
		s.accept();
		s.acceptdetails();

	}

}
