package day5_Inheritance;

//Multilevel  inheritance

class Cat1 
{
	int cid;
	String cname;
	
	public void setcId(int cid)
	{
		this.cid=cid;
	}
	public void setcName(String cname)
	{
		this.cname=cname;
	}
	public int getcId()
	{
		return cid;
	}
	public String getcName()
	{
		return cname;
	}
}
class Animal2 extends Cat1 
{
	int id;
	String name;
	public void setId(int id)
	{
		this.id=id;	
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return id;	
	}
	public String getName()
	{
		return name;
	}
}


	
public class Dog3 extends Animal2 
{
	int did;
	String dname;

	public void setdId(int did)
	{
		this.did=did;
	}
	public void setdName(String dname)
	{
		this.dname=dname;
	}
	public int getdId()
	{
		return did;	
	}
	public String getdName()
	{
		return dname;	
	}
	
	

	public static void main(String[] args) {
		Dog3 d =new Dog3();
		d.setdId(123);
		d.setdName("pitbull");
		d.setId(456);
		d.setName("xyz");
		d.setcId(456);
		d.setcName("Cat name");
	
		System.out.println(d.getdId()+"   "+d.getdName());
		System.out.println(d.getId()+"  "+d.getName());
		System.out.println(d.getcId()+" "+d.getcName());
		
	}

}


