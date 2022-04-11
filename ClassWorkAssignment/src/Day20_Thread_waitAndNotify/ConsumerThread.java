package Day20_Thread_waitAndNotify;

public class ConsumerThread extends Thread
{
	ChocolatesBasket basket;
	String name;
	
	public ConsumerThread(ChocolatesBasket basket, String name)
	{
		super(name);
		this.basket = basket;
		this.name = name;
	}

	public void run()
	{
		basket.consumeChocolate();
	}

}
