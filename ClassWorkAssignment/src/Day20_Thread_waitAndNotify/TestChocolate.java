package Day20_Thread_waitAndNotify;

public class TestChocolate {

	public static void main(String[] args) throws InterruptedException {
		
		ChocolatesBasket choc=new ChocolatesBasket("5 star", 100);
		
		
		ConsumerThread t1=new ConsumerThread(choc, "Abhishek");
		ConsumerThread t2=new ConsumerThread(choc, "Yuvraj");
		ConsumerThread t3=new ConsumerThread(choc, "Chaitanya");
		
		t1.start();
		t2.start();
		t3.start();
		
		Thread.sleep(3000);
		
		ProducerThread p1=new ProducerThread(choc, "Gayatri");
		p1.start();

	}

}
