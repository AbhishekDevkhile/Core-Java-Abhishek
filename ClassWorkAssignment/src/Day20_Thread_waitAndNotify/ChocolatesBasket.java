package Day20_Thread_waitAndNotify;

import java.util.Scanner;

public class ChocolatesBasket 
{
	String chocolatenmae;
	int qty;
	
	
	public ChocolatesBasket(String chocolatenmae, int qty) 
	{
		this.chocolatenmae = chocolatenmae;
		this.qty = qty;
	}
	
	public synchronized void consumeChocolate()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many chocolates u want "+Thread.currentThread().getName());
		
		int c_qty=sc.nextInt();
		while(true)
		{
			if(qty>c_qty)
			{
				System.out.println("Chocolates availabe in basket"+qty+"  "+Thread.currentThread().getName());
				qty=qty-c_qty;
				System.out.println("After consumption Chocolates"+qty);
				break;
				
			}
			else
			{
				System.out.println("Insufficient chocolate");
				System.out.println("Waiting for more chicolates....."+Thread.currentThread().getName());
				try 
				{
					wait();                                      //thread   method
					System.out.println("Out from waiting"+Thread.currentThread().getName());
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}
	public synchronized void produceChocolate()
	{
		System.out.println("Producer thread"+"  "+Thread.currentThread().getName());
		qty=qty+50;
		System.out.println(" Chocolate produced"+qty);
		notifyAll();                  //thread   method
	 
	}
	
	
	
	
	
	

}
