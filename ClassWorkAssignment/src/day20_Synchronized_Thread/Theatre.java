package day20_Synchronized_Thread;

import java.util.Scanner;

public class Theatre {
	
	private String theatreName;
	private String movieName;
	private int ticket_available;
	

	public Theatre(String theatreName, String movieName, int ticket_available) {
		super();
		this.theatreName = theatreName;
		this.movieName = movieName;
		this.ticket_available = ticket_available;
	}
    // synchronized:-lock object level                                 //Also write here or in before if loop
	public synchronized void bookticket()
	//public void bookticket()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Current thread to book ticket  "+Thread.currentThread().getName());
		System.out.println("Ticket Available  "  +ticket_available);
		System.out.println("enter tickets to book  "+Thread.currentThread().getName());
		
		int t=sc.nextInt();
		
		
	//	synchronized(this) 
	//	{   
		
		if(ticket_available>=t)
		{
			System.out.println("Ticket Available  "+Thread.currentThread().getName());
			ticket_available=ticket_available-t;
			System.out.println("Ticket booked successfully by   "+Thread.currentThread().getName());
				
		}
		else
		{
			System.out.println("Insufficient Tickets");
		}
	
		
		
	}


}
