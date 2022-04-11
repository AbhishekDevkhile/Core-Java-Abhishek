package day4_StaticVariableOrMethod;

public class Student {
	int sid;
	String sclass; 
	static String cname="VIT,Pune";
	
	
	static void stud1()
	{
		Student s=new Student();
		s.sid=123;
		s.sclass="FE";
		s.show();
	}
	static void stud1(int x,int y)
	{
		Student s=new Student();
		s.sid=234;
		s.sclass="SE";
		System.out.println(x+y);
		s.show();
	}
	static void stud1(float a)
	{
		Student s=new Student();
		s.sid=345;
		s.sclass="TE";
		s.show();
	}
	static void stud1(int x)
	{
		Student s=new Student();
		s.sid=456;
		s.sclass="BE";
		s.show();
	}
	void show() 
	{
		System.out.println("Student id:"+sid+" "+"Student class:"+sclass+" "+"College name:"+cname);
	}

	public static void main(String[] args) {
		
		stud1();
		stud1(4.5f);
		stud1(8,6);
		stud1(4);


	}

}
