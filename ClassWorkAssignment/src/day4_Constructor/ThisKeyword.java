package day4_Constructor;

public class ThisKeyword {
	int carid;
	int carprice;
	String carName;
	String carColor;
	
	//Default Constructor
	ThisKeyword()
	{
		System.out.println("Default Constructor");
		carid=123;
		carprice=1234;
		carName="asdf";
		carColor="black";
		
	}
	
	//parameterized constructor
	ThisKeyword(int id,int pr,String n,String c)
	{
		System.out.println("Parameterized constructor");
		this.carid=id;
		this.carprice=pr;
		this.carName=n;
		this.carColor=c;
		
		
		this.showDetails(); //one method to another method method call 
	}
	
	void showDetails()
	{
		System.out.println("Car id is : "+carid);
		System.out.println("Car price is : "+carprice);
		System.out.println("Car Name is : "+carName);
		System.out.println("Car color is: "+carColor);
		
	}
	
	

	public static void main(String[] args) {
		
		ThisKeyword t1=new ThisKeyword();
		t1.showDetails();
	
   System.out.println();
   
   		ThisKeyword t2=new ThisKeyword(123,123456,"cvb","blue");
   		t2.showDetails();
	}

}
