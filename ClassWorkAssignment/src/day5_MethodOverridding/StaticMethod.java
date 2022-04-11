package day5_MethodOverridding;
//Static method cannot be overload

class StaticMethod2
{  
static void input()
{
	 StaticMethod s1=new StaticMethod();
	 s1.roll=456;
	
	
}
}
public class StaticMethod extends StaticMethod2 {
	int id;
	String name;
	int roll;
	
	 static void input()
	{
		 StaticMethod s=new StaticMethod();
		 s.id=123;
		 s.name="Abhi";
		// super(s.input());      //static method can't be override
		 s.showDetails();
		
	}

	 void showDetails()
	 {
		 System.out.println(id+" "+name);
	 }

	public static void main(String[] args) {
	input();
	//output();       //static method can't be override

	}

}
