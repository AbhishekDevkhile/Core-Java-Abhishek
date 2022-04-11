package Day5_Inheritance_And_Polymorphism;
/*6. Create a class named 'Rectangle' with two data members 
'length' and 'breadth' and two methods to print the area and 
perimeter of the rectangle respectively. Its constructor having 
parameters for length and breadth is used to initialize length 
and breadth of the rectangle. Let class 'Square' inherit 
the 'Rectangle' class with its constructor having a parameter
 for its side (suppose s) calling the constructor of its 
 parent class as 'super(s,s)'.
Print the area and perimeter of a rectangle and a square.
.*/

class Square
{
	int s;
	Square(int s)
	{
		System.out.println("Area if square:"+(s*s));
	}
}
public class Rectangle extends Square {
	int length;
	int breadth;
	Rectangle(int len,int brth)
	{
		super(8);
		System.out.println("Constructor of rectangle class");
	}
	void Area(int len,int brth)
	{
		System.out.println("Area of Rectangle: "+(len*brth));
	}
	void Perimeter(int len,int brth)
	{
		System.out.println("Perimeter of Rectangle:"+(2*(len*brth)));
	}

	public static void main(String[] args) {
		Rectangle r=new Rectangle(10,10);
		r.Area(15,10);
		r.Perimeter(20,10);
		

	}

}
