package day5_Inheritance;
//Hierarchical  inheritance


class Animal1 {
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

class Cat extends Animal1
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
	
public class Dog1 extends Animal1 
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
		Dog1 d =new Dog1();
		d.setdId(123);
		d.setdName("pitbull");
		d.setId(456);
		d.setName("xyz");
		
		Cat c=new Cat();
		c.setcId(369);
		c.setcName("Cat name");
		c.setId(852);
		c.setName("Cat");
		
		
		System.out.println(d.getdId()+"   "+d.getdName());
		System.out.println(d.getId()+"  "+d.getName());
		
		System.out.println(c.getcId()+" "+c.getcName());
		System.out.println(c.getId()+"  "+c.getName());

	}

}

