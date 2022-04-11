package day3;

public class Pattern14_N_Pattern {

	public static void main(String[] args) {
	int n=5;
		for(int i=1; i<=4 ; i++)
		{
			for(int j=1; j<=4 ; j++)
			{
				if(j==4||j==1||j==i )
				 {
					System.out.print("*");
				 }
				else 
				{
					System.out.print(" ");
				}
				
			}
			
			   System.out.println( );
		}



	}

}
