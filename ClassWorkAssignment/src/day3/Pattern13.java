package day3;

public class Pattern13 {

	public static void main(String[] args) 
	{
		int alphabet =64;
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" " +(char) (j+64));
			}
			System.out.println(" ");
		}

	}

}
