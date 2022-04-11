package Day6_AbstractClassAnd_Interface;
abstract class Vehicle
{   
	int cid;
	String cname;
	abstract void car();
 
}

abstract class Car extends Vehicle
{
	void car(int id,String nm)
	{
		this.cid=id;
		this.cname=nm;
	}
  
}
public class Program3 {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
