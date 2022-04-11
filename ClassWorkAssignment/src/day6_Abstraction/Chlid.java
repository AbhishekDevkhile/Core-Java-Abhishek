package day6_Abstraction;

/*3. What is abstraction show the code of real time example?*/

abstract class Parent
{
	int id=123;
	String name;
	abstract void Details();
	
	void Show()
	{
		
	}
	
}
public class Chlid extends Parent 
{
	
	public void Details()
	{
		int id;
	}
	void Show()
	{
		System.out.println(this.id);
	}

	public static void main(String[] args) {
		Chlid c=new Chlid();
		c.Show();
		
		Parent p=new Chlid();
		p.Show();
		

	}

}
