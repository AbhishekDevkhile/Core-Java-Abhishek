package Day2;

public class Prime_no_OR_not {

	public static void main(String[] args) {

		System.out.println("Display Prime no. or Not.");
		int no=7,temp=0;
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}
			if(temp==0)
			{
				System.out.println("Is a Prime no.");
			}
			else 
			{
				System.out.println("Not a Prime no.");
			}
		
			
		}

	}


