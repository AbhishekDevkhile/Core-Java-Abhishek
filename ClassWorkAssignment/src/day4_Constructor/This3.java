package day4_Constructor;

public class This3 {
	int id;
	
	This3()
	{
		this(100);
	}
    This3(int id)
    {
    	this.id=id;
    	
    	this.show();
    }
    
    void show()
    {
    	System.out.println("Constructor chaining(1->2->3 method calls)");
    	System.out.println(id);
    }
    public static void main(String[] args) {
    	This3 t=new This3();
		

	}


}
