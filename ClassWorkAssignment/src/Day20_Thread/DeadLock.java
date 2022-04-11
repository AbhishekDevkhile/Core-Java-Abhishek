package Day20_Thread;

public class DeadLock {

	public static void main(String[] args) {
		String s1="Abhishek";
		String s2="Chaitanya";
		
		
		Thread t1=new Thread()
			{
			
			public void run() 
			{
			
				System.out.println("Current thread:  "+Thread.currentThread().getName());
				synchronized (s1) 
				{
					System.out.println("Lock acquried  "+s1);
					try
					{
						Thread.sleep(3000);
					}
					catch(InterruptedException e)
					{
			
						e.printStackTrace();
					}
					
					System.out.println("wating for lock  "+s1);
					synchronized (s2) 
					{
					 System.out.println("**Acquired lock of  "+s2); 	
					}
					
				}
			
			}
			
			};
		t1.start();
		
		

		Thread t2=new Thread()
			{
			
			public void run() 
			{
			
				System.out.println("Currenr thread:"+Thread.currentThread().getName());
				synchronized (s2) 
				{
					System.out.println("Lock acquried  "+s2);
					try
					{
						Thread.sleep(3000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					
					System.out.println("wating for lock  "+s2);
					synchronized (s1) 
					{
					 System.out.println("**Acquired lock of  "+s1); 	
					}
					
				}
			
			}
			
			};
		t2.start();

	}

}
