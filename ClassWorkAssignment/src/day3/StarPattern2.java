package day3;

public class StarPattern2 {

	public static void main(String[] args) {
		System.out.println("Star pattern left down side triangle");
		
		for(int i=1; i<=4 ; i++)
		{
			for(int j=1; j<=i ; j++)
			{
				System.out.print("*");
				
			}
			System.out.println( );
		}

	}

}
