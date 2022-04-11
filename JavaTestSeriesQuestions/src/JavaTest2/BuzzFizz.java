package JavaTest2;
/*
 Write a Java program that prints the numbers
from 1 to 50. But for multiples of three print “buzz” instead of the
number and for the multiples of five print “fizz”. For numbers which
are multiples of both three and five print “ buzzfizz “. After program
looping is completed print how many times buzz was printed, fizz
was printed and buzzfizz was printed.
*/
public class BuzzFizz {
	

	public static void main(String[] args) {
		int counter1=0;
		int counter2=0;
		int counter3=0;
		
		for(int i=1;i<=50;i++)
		{
			if(i%3==0)
			{
				counter1++;
				System.out.println("Buzz");
			}
			else if(i%5==0)
			{
				counter2++;
				System.out.println("Fizz");
			}
			else if(i%3==0 &&  i%5==0) 
			{
				counter3++;
				System.out.println("BuzzFizz");
			}
		
			
		}
		
		System.out.println("Buzz:"+counter1);
		System.out.println("Fizz:"+counter2);
		System.out.println("BuzzFizz:"+counter3);
		

	}

}
