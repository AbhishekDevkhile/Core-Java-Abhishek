package day2;

public class for_while_Addition_odd_nos {

	public static void main(String[] args) 
	{
		System.out.println("Addition of Odd nos. using for loop");
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0) 
			{
				//i=sum;
				sum = sum + i; 
			}
		}
		System.out.println("Sum is :" +sum);

	
	
	System.out.println("");
	System.out.println("");
	
	
	System.out.println("Addition of Odd nos. using While loop");
	int j = 1;
	int sum1 =0;
	
	while(j<=20)
	{
		if(j%2!=0)
			sum1 = sum1 + j;
		    j++;
	}
		//j++;
		System.out.println("Sum is :" +sum1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
