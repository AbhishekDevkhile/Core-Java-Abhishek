package Day4_Constructor_Static_Polymorphism;
/*
11. Create a class to print the area of a square and a rectangle. The class has
two methods with the same name but different number of parameters. The
method for printing area of rectangle has two parameters which are length
and breadth respectively while the other method for printing area of
square has one parameter which is side of square.
*/

public class CalculateArea 
{
	int side,length,breath;
	
	void area(int len,int br)
	{
		this.length=len;
		this.breath=br;
	}
	void area(int sd)
	{
	     this.side=sd;
	     
	}
	void  areaIs()
	{
		System.out.println("Area od rectangle: "+(this.breath*this.length));
		System.out.println("Area of Square: "+(this.side*this.side));
	}

	public static void main(String[] args) {

		CalculateArea a=new CalculateArea();
		a.area(10,5);
		a.area(5);
		a.areaIs();
	}

}
