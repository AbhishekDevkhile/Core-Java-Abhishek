package day4_Constructor;

public class This2 {
	
	void display()
	{
		System.out.println("Hello");
	}

	void show()
	{
		this.display();  //one method call another method
	}
	public static void main(String[] args) {
		
		This2 t=new This2();
		t.show();
		
		

	}

}
