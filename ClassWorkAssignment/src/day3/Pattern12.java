package day3;

public class Pattern12 {

	public static void main(String[] args) {
		int alphabet=64;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" " +(char)(i+64));
			}
			System.out.println(" ");
		}

	}

}
