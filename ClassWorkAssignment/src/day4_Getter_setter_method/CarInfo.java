package day4_Getter_setter_method;

import java.util.Scanner;

public class CarInfo {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter car model id:");
		int id=sc.nextInt();
		System.out.println("enter car name:");
		String name=sc.next();
		System.out.println("Enter car color:");
		String color=sc.next();
		System.out.println("Enter car price:");
		double pri=sc.nextDouble();
		System.out.println("Enter car Speed:");
		int sp=sc.nextInt();
		
		Car c=new Car();
		
		c.setmodelId(id);
		c.setcarName(name);
		c.setcarColor(color);
		c.setcarPrice(pri);
		c.setcarSpeed(sp);
		
		
		System.out.println(c.getmodelId());
		System.out.println(c.getcarName());
		System.out.println(c.getcarColor());
		System.out.println(c.getcarPrice());
		System.out.println(c.getcarSpeed());

		sc.close();
	}

}
