package day20_Synchronized_Thread;

public class Customerthread extends Thread{
	String customerName;
	Theatre theatre;
	
	
	public Customerthread(String customerName, Theatre theatre) {
		super(customerName);
		this.customerName = customerName;
		this.theatre = theatre;
	}
	
	public void run()
	{
		theatre.bookticket();
	}
	
	
	
	

}
