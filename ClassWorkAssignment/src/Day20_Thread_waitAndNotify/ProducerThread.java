package Day20_Thread_waitAndNotify;

public class ProducerThread  extends Thread
{
	ChocolatesBasket basket;
	String name;
	public ProducerThread(ChocolatesBasket basket, String name) {
		super(name);
		this.basket = basket;
		this.name = name;
	}
	public void run()
	{
		basket.produceChocolate();
	}

}
