package day20_Synchronized_Thread;

public class DemoClasslevelLock extends Thread{
	
	static int c;
	
	//class level lock
	
	
//	static synchronized void update()            // synchronized lock write here or before loop
	static void update()
	{
		
		synchronized(DemoClasslevelLock.class)      
		{
			for(int i=0;i<=10000;i++)
			{
				c++;
			}
		}
		
	}
	
	public void run()
	{
		update();
	}

	public static void main(String[] args) throws InterruptedException  {
		DemoClasslevelLock d1=new DemoClasslevelLock();
		
		DemoClasslevelLock d2=new DemoClasslevelLock();
		
		
		d1.start();
		d2.start();
		
		d1.join();
		d2.join();
		
		System.out.println(DemoClasslevelLock.c);
		
		
		

	}

}
