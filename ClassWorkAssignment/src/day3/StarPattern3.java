package day3;

public class StarPattern3 {

	public static void main(String[] args) {

		System.out.println("Star pattern left up side triangle");
		for(int i=1 ;i<=4; i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
