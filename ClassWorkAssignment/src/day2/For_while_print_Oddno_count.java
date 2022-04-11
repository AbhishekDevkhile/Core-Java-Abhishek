package day2;

public class For_while_print_Oddno_count {

	public static void main(String[] args) {
		System.out.println("Using For loop print odd nos count.");
		int count=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0) 
			{
				count++;
			}
			
		}
			System.out.println(count);

					
	System.out.println("");
	System.out.println("");
			
			
	     System.out.println("Using While loop print odd nos count.");
	     
	     int j=1;
	     int count1=0;
	     
	     while(j<=10)
	     {
	    	 if(j%2!=0)
	    	 {
	    		 count1++;
	    	 }
	    	     j++;
	     }
	     System.out.println(count1);
	  		
	}

}
