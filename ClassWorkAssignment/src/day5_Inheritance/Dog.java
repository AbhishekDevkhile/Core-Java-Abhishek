package day5_Inheritance;
//Single level inheritance
class Animal {
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
public class Dog extends Animal 
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
		Dog d =new Dog();
		d.setdId(123);
		d.setdName("pitbull");
		d.setId(456);
		d.setName("xyz");
		
		System.out.println(d.getdId()+"   "+d.getdName());
		System.out.println(d.getId()+"  "+d.getName());

	}

}
