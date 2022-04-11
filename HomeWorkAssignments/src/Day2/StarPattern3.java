package Day2;

public class StarPattern3 {

	public static void main(String[] args) {
		System.out.println("Generate star pattern");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) 
			{
			System.out.print(" "+i);
			}
			System.out.println();
		}
		
	}

}
