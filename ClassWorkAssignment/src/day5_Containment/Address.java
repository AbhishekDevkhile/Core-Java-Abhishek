package day5_Containment;

      //Containment using Getter-Setter 


class Person
	{
		int id;
		String name;
		Address adr;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	public void setAdr(Address adr)
	{
		this.adr=adr;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Address getAdr()
	{
		return adr;
	}

}

public class Address {
	int zipcode;
	String city;
	
	public void setZipCode(int zipCode)
	{
		this.zipcode = zipCode;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public int getZipCode()
	{
		return zipcode;
	}
	public String getCity()
	{
		return city;
	}
	public static void main(String[] args) {

		Person p=new Person();
		
		p.setId(101);
		p.setName("Abhishek");
		
		Address a= new Address();
		p.setAdr(a);
		a.setZipCode(456);
		a.setCity("Pune");
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		
		System.out.println(a.getZipCode());
		System.out.println(a.getCity());

	}
}


