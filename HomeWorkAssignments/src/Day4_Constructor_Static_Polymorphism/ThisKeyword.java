package Day4_Constructor_Static_Polymorphism;
/*
10. Show the use of this keyword in Program –
  a. with a field(Instance Variable)
   b. with Constructor
    c. with Method
*/
public class ThisKeyword 
{ 	
	int id;
	String name;
	ThisKeyword()       //Default constructor
	{
		System.out.println("Default constructor");
	}
	ThisKeyword(int a)    //Parameterized Constructor
	{
		this();             //"this()"keyword can be used to invoke current class constructor
		System.out.println("Parameterized Constructor");
	}
	

	public void accept(int id)
	{
		this.id=id;       //"this" keyword is used to invoke current class instance variable   
	}
	public void show()
	{
		System.out.println("Customer id :"+id);
		this.ShowDetails(456, "Chaitanya");          //method invoke
	}
	void ShowDetails(int Id,String name)
	{
		System.out.println("Cust Id: "+id+" "+"Cust name: "+name);
	}

	public static void main(String[] args) {
		ThisKeyword t=new ThisKeyword();
		t.accept(123);
		t.show();
		
		ThisKeyword k=new ThisKeyword(10);   //Call parameterized constructor
	}

}
