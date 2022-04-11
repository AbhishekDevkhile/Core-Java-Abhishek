package Day4_Constructor_Static_Polymorphism;
/*
3. Create default constructor assign new value to all variables and write “ I am in default Constructor”
4. In main, create another object of the Account class and print the member variables value.
(Note – Since you have defined a (default) constructor, Java does not provide another one)
*/


public class Account1 
{
	int accNo;
	String custName;
	Account1()
	{
		this.accNo=123456789;
		this.custName="Chaitanya";
		System.out.println("I am in default constructor");
	}
	void showDetails()
	{
		//this.accNo=987654321;
		//this.custName="Chaitanya";
		System.out.println("Account No:"+accNo);
		System.out.println("Customer Nmae:"+custName);
	}
	public static void main(String[] args) {
		Account1 b=new Account1();    //create a new object of the Account class 
		b.showDetails();
		

	}

}
