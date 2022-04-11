package day3;

public class Pattern_17 {

	public static void main(String[] args) 
	{
		int alphabet=65;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2 != 0)
				{
					System.out.print(" "+(char)(j+64));
				}
				else
				{
					System.out.print(" "+j);
				}
				
				
//1				System.out.print("*");
			}
			System.out.println();
		}

	}

}
