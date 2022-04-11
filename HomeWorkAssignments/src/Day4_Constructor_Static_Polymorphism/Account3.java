package Day4_Constructor_Static_Polymorphism;
/*
5. Define a constructor which takes all arguments and assigns those values to the instance variables and write “I am in parameterized constructor”
6. In main, to create another object of the Account class using the constructor with all arguments and print the instance variable values.
7. In main method, create 2 Account objects with different account numbers and names and print the values of all the member variables of both the accounts.
*/


public class Account3 {
		int accNo;
		String custName;
		Account3(int a,String c)
		{
			System.out.println("I am parameterized constructor");
			this.accNo=a;
			this.custName=c;
		}
		void showDetails()
		{
			System.out.println("Account no:"+accNo);
			System.out.println("Customer Name:  "+custName);
		}
	public static void main(String[] args) {

		Account3 a=new Account3(789456123, "Devkhile");
		a.showDetails();
		
		Account3 b=new Account3(11111111,"Abhishek");
		b.showDetails();
		}

}
