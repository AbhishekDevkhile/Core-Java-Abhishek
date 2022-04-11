package Day3_ClassAndObject;

public class Account {
	int accno;
	String cname;
	String bname;
	double amount=4000;
	double total;
	void insert(int accno,String cname,String bname)
	{
		this.accno=accno;
		this.cname=cname;
		this.bname=bname;
	}
	void display()
	{
		System.out.println("Account number is :"+accno);
		System.out.println("Customer name:"+cname);
		System.out.println("Bank name is:"+bname);
	}
	void deposit(double credit)
	{
		total=amount+credit;
	}
	void withdraw(double debit)
	{
		total=total-debit;
	}
	void checkBalance()
	{
		System.out.println("Total balence:"+total);
	}
	

	public static void main(String[] args) {
		Account a=new Account();
		a.insert(789,"Abhishek","SBI");
		a.display();
		a.deposit(4000);
		a.withdraw(2000);
		a.checkBalance();
		

		

	}

}
