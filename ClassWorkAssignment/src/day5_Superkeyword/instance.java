package day5_Superkeyword;	
//Super keyword using Instance variable

class Parent
 {
	int x=20;
	}
public class instance extends Parent
{
	int x=10;
   
	public void show()
	{
		System.out.println(super.x);     //using super keyword parent variable call
		System.out.println(x);
		
	}


	public static void main(String[] args) 
	{

		instance i=new instance();
		i.show();
	}

}
