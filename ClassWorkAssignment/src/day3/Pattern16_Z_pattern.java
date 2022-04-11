package day3;

public class Pattern16_Z_pattern {

	public static void main(String[] args) {

		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=1;j--)
			{
				if(i==1 || i==j || i==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}

	}

}
