package Day2;

public class StarPattern {

	public static void main(String[] args) {

		System.out.println("Generate Star Pattern");
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
		    }
		
         System.out.println();
	    }

	}
} 
