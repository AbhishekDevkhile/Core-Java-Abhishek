package Day20_Thread;

public class Deamon  extends Thread
{
	public void run()
	{
		for(int i=0;i<50;i++)
		{
			System.out.println(i);
		}
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) 
	{
		Deamon d=new Deamon();
		d.setDaemon(true);
		d.start();
		
		
		for(int i=901;i<=1000;i++)
		{
			System.out.println("main"+i);
		}
	}

}
