package day4_Constructor;

public class This1 {
	int id;
	
	This1(int id)
	{
		this.id=id;    
	}

	void show()
	{
		System.out.println(id);
	}
	public static void main(String[] args) {
		
		This1 t=new This1(20);
		t.show();
		
		

	}

}
