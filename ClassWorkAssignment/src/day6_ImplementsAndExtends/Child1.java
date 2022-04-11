package day6_ImplementsAndExtends;
/*100 percentage abstraction*/
interface Movable
{
	void move();
}

class Test1 implements Movable
{
	public void move()
	{
		System.out.println("move");
	}
}
public class Child1 {
	
	
	public Movable show()
	{
		return new Test1(); 
	}

	public static void main(String[] args) {
		
		
		Child1 c=new Child1();
		  c.show().move();
	}

}
