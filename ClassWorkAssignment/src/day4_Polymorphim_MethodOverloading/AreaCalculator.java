package day4_Polymorphim_MethodOverloading;

public class AreaCalculator {
	
	void area(float len,float hgt)
	{
		System.out.println("Area of rectangle:" +(0.5*len*hgt));
	}
	void area(float pi,float r,float r1)
	{
		System.out.println("Area of Circle:"+(pi*r*r1));
	}
	void area(int len,int hgt)
	{
		System.out.println("Area of Square:"+(len*hgt));
	}

	public static void main(String[] args) {


		AreaCalculator a=new AreaCalculator();
		a.area(15, 20);
		a.area(3.14f,10f,10f);
		a.area(15,20);

	}

}
