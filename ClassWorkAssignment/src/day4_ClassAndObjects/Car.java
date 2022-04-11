package day4_ClassAndObjects;

import java.util.Scanner;

public class Car {
	int carNo;
	String carName;
	String carColor;
	float carPrice;
	Scanner sc = new Scanner(System.in);
	void acceptDetails() 
	{
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter car number :");
		carNo=sc.nextInt();
		System.out.println("Enter car Name :");
		carName=sc.next();
		System.out.println("Enter car color :");
		carColor=sc.next();
		System.out.println("Enter car price :");
		carPrice=sc.nextFloat();
	}
	
	void showDetails()
	{
		System.out.println("Car number is "+carNo);
		System.out.println("Car Name is "+carName);
		System.out.println("Car Color is "+carColor);
		System.out.println("Car Price is "+carPrice);
		
	}

	public static void main(String[] args) 
	{

		System.out.println("Enter First car details");
		Car c = new Car();
		c.acceptDetails();
		System.out.println(" Details of car ");
		c.showDetails();
		
		System.out.println( );
		System.out.println("Enter Second car details");
		Car c1 = new Car();
		c1.acceptDetails();
		System.out.println(" Details of car ");
		c1.showDetails();
		
		System.out.println( );
		System.out.println("Enter Third car details");
		Car c2 = new Car();
		c2.acceptDetails();
		System.out.println(" Details of car ");
		c2.showDetails();
		
	 
		
	}

}

