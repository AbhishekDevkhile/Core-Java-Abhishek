package day20_Synchronized_Thread;

public class TestMovie {
	
	

	public static void main(String[] args) 
	{
		Theatre th1=new Theatre("PVR","Dhammal",10);
		
		
		Theatre th2=new Theatre("INOX","URI",10);
		
		
		Customerthread c1=new Customerthread("Abhi", th1);
		
		Customerthread c2=new Customerthread("Chaitanya", th2);
		
		c1.start();
		c2.start();
		
		
		
		
		
		

	}

}
