package Day4_Constructor_Static_Polymorphism;

public class Cycle {
	int accountNo;
	int noOfWheels;
	
	Cycle()
	{
		
		System.out.println("I an default constructor");
	}
	Cycle(int accNo,int wheels)
	{
		this.accountNo=accNo;
		this.noOfWheels=wheels;
		System.out.println("I am another constructor");
	}
	void show()
	{
		System.out.println(this.accountNo+"  "+this.noOfWheels);
	}
	

	public static void main(String[] args) {

		Cycle c=new Cycle();        //call default constructor
		
		Cycle c1=new Cycle(123,2);   //call parameter constructor 
		c1.show();
		

	}
	
		
	}

