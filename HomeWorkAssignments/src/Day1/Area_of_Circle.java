package Day1;
import java.util.Scanner;

public class Area_of_Circle {

	public static void main(String[] args) 
	{
		System.out.println("Find Area of Circle :-");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius Value : ");
		int Radius = sc.nextInt();
		
		float PI = 3.14f;
		
		double AreaofCircle =  PI  * Radius * Radius ;
		
		System.out.println(" Area of Circlr is :- " + AreaofCircle);

	}

}
