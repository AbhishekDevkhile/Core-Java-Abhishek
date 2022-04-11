package day6_ImplementsAndExtends;


abstract class N1
{
	int x=5;
	
}
interface N2
{
	int y=6;
}


public class Addition extends N1 implements N2
{
	void show()
	{
		System.out.println("Addition is:"+(x+y));
	}

	
	public static void main(String[] args) {
		Addition a=new Addition();
		a.show();

	}

}
