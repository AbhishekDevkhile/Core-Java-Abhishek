package day4_Constructor;

public class Test {
	
	int carid;
	int carprice;
	String carName;
	String carColor;
	
	//Default Constructor
	Test()
	{
		System.out.println("Default Constructor");
		carid=123;
		carprice=1234;
		carName="asdf";
		carColor="black";
		
	}
	
	//parameterized constructor
	Test(int id,int pr,String n,String c)
	{
		System.out.println("Parameterized constructor");
		carid=id;
		carprice=pr;
		carName=n;
		carColor=c;
		showDetails();
	}
	
	void showDetails()
	{
		System.out.println("Car id is : "+carid);
		System.out.println("Car price is : "+carprice);
		System.out.println("Car Name is : "+carName);
		System.out.println("Car color is: "+carColor);
		
		
	}
	
	

	public static void main(String[] args) {
		
	Test t1=new Test();
	t1.showDetails();
	
   System.out.println();
   
	Test t2=new Test(123,123456,"cvb","blue");
	t2.showDetails();
	}

}
