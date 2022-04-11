package Day2;

public class StarPattern2 {

	public static void main(String[] args) {

		System.out.println("Generate star pattern");
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
 			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
			     System.out.print("*");	
			}
			System.out.println();
		}
	

	}

}
