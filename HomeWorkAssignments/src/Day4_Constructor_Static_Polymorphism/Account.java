package Day4_Constructor_Static_Polymorphism;
/*
 1. Create a class Account with member Variable: long accountNo, String customerName,
2. In main, create a new object of the Account class and print the instance variables value
*/


public class Account       //Create a class Account with member Variable
{
	long accNo;
	String custName;
	public void acceptDetails()
	{
		accNo=123456789;
		custName="Abhishek";
	}
	public void showDetails()
	{
		System.out.println("Account No:"+accNo);
		System.out.println("Customer Name:"+custName);
	}

	public static void main(String[] args) {

		Account a=new Account();    //create a new object of the Account class 
		a.acceptDetails();
		a.showDetails();                  //print the instance variables value.
		
		
	}

}
