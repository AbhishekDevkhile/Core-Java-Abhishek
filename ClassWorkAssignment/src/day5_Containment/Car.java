package day5_Containment;


class Engine
{
	String etype;
		
public void seteType(String etype)
{
	this.etype=etype;
}

public String geteType()
{
	return etype;
}

}

public class Car 
{
	int cid;
	String cname;
	Engine eng;
	
	public void setcId(int cid)
	{
		this.cid=cid;
	}
	public void setcName(String cname)
	{
		this.cname=cname;
	}
	public void setEngine(Engine eng)
	{
		this.eng=eng;
	}
	public int getcId()
	{
		return cid;
	}
	public String getcName()
	{
		return cname;
	}
	public Engine getEngine()
	{
		return eng;
	}
	


	public static void main(String[] args) 
	{

		Engine e=new Engine();
		e.seteType("4 Stroke");
		
		
		Car c=new Car();
		c.setEngine(e);
		c.setcId(123);
		c.setcName("Alto");
		
		System.out.println(e.geteType());
		
		System.out.println(c.getcId());
		System.out.println(c.getcName());
		
		

	}
}
	
