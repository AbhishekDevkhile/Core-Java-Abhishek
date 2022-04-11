package JavaTest3;

public class Shopping {
		int DebitCard;
		String CreditCard;
	void doTransaction(String ccard)
	{
		this.CreditCard=ccard;
		System.out.println("You got 15% discount on bill on Credit card transaction");
	}
	void doTransaction(int dcard)
	{
		this.DebitCard=dcard;
		System.out.println("No discount on bill on Debit card transaction");
	}

	public static void main(String[] args) {
		Shopping s=new Shopping();
		s.doTransaction(123);
		s.doTransaction("asd");
		

	}

}
