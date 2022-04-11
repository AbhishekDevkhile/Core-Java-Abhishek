package day2;

public class for_while_Print_Even_nos {

	public static void main(String[] args) 
	{
		System.out.println("Using For loop print Even nos.");
	
		for(int i=1;i<=30;i++)
		{
			if(i%2==0) 
			{
				System.out.println(i);
			}
			
		}
		//System.out.println("Not even");
		
		
		System.out.println("");
		System.out.println("");
		

	System.out.println("Using while loop print Even nos.");
	
	int j=1;
	while(j<=30)
	{
		if(j%2==0)
			System.out.println("" +j);
		j++;
	}
	
	}
}


